package org.spring.util;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: org.spring.util
 * @Author: zhanglang
 * @CreateTime: 2020-03-22 21:09
 * @Description:
 */
public class BeanFactory {
    /**
     *
     */
    Map<String,Object> map = new HashMap<String,Object>();

    public BeanFactory(String xml){
        parseXml(xml);
    }

    /**
     * 解析xml
     */
    public void parseXml(String xml) throws ZlSpringException{
        File file = new File(this.getClass().getResource("/").getPath()+"//"+xml);
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            Element elementRoot = document.getRootElement();
            // 自动装配
            Attribute attribute = elementRoot.attribute("default-autowire");
            boolean flag =false;
            if(attribute != null){
                flag = true;
            }
            for(Iterator<Element> itFirst = elementRoot.elementIterator(); itFirst.hasNext();){
                /**
                 * 1、实例化对象
                 */
                Element elementFirst = itFirst.next();
                Attribute attributeId = elementFirst.attribute("id");
                String beanName = attributeId.getValue();
                Attribute attributeClass = elementFirst.attribute("class");
                String clazzName = attributeClass.getValue();
                Class clazz = Class.forName(clazzName);
                // setter注入,这个方法是必须存在默认构造方法
                // Object object = Class.forName(clazzName).newInstance();
                // 构造器注入
                Object object = null ;
                /**
                 * 2、维护依赖关系
                 *     看这个对象有没有依赖(判断是否有property属性.或者判断类是否有属性)
                 *     如果有则注入
                 */
                for(Iterator<Element> itSecond = elementFirst.elementIterator();itSecond.hasNext();){
                    // 得到ref的value，通过value得到对象（从map获取）
                    // 得到name的值，根据值获取Filed的对象
                    // 通过Field的set方法
                    Element elementSecond = itSecond.next();
                    if(elementSecond.getName().equals("property")){
                        // 由于是setter方法，没有特殊的构造方法
                        // 得到目标对象
                        object = clazz.newInstance();
                        String refValue = elementSecond.attribute("ref").getValue();
                        Object injectObject = map.get(refValue);
                        String nameValue = elementSecond.attribute("name").getValue();
                        Field field = clazz.getDeclaredField(nameValue);
                        // 值true表示反射对象在使用时应禁止检查Java语言访问控制。 值false表示反射对象在使用时应强制检查Java语言访问控制
                        field.setAccessible(true);
                        field.set(object,injectObject);

                    }else{ // 证明有特殊构造方法
                        String refValue = elementSecond.attribute("ref").getValue();
                        Object injectObject = map.get(refValue);
                        String nameValue = elementSecond.attribute("name").getValue();
                        Field field = clazz.getDeclaredField(nameValue);
                        field.setAccessible(true);
                        Class<?> declaringClass = field.getType();
                        Constructor constructor = clazz.getConstructor(declaringClass);
                        object = constructor.newInstance(injectObject);
                    }
                }
                if(object==null) {
                    if (flag) {
                        if (attribute.getValue().equals("byType")) {
                            //判斷是否有依賴
                            Field fields[] = clazz.getDeclaredFields();
                            for (Field field : fields) {
                                //得到屬性的類型，比如String aa那麽這裏的field.getType()=String.class
                                Class injectObjectClazz = field.getType();
                                /**
                                 * 由於是bytype 所以需要遍历map当中的所有对象
                                 * 判断对象的类型是不是和这个injectObjectClazz相同
                                 */
                                int count = 0;
                                Object injectObject = null;
                                for (String key : map.keySet()) {
                                    Class temp = map.get(key).getClass().getInterfaces()[0];
                                    if (temp.getName().equals(injectObjectClazz.getName())) {
                                        injectObject = map.get(key);
                                        //记录找到一个，因为可能找到多个count
                                        count++;
                                    }
                                }

                                if (count > 1) {
                                    throw new ZlSpringException("需要一个对象，但是找到了两个对象");
                                } else {
                                    object = clazz.newInstance();
                                    field.setAccessible(true);
                                    field.set(object, injectObject);
                                }
                            }
                        }
                    }
                }
                if(object == null){
                    object = clazz.newInstance();
                }
                map.put(beanName,object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String beanName){
        return map.get(beanName);
    }
}
