package com.zhanglang.monimybatis;

import com.zhanglang.dao.MyUserDao;
import com.zhanglang.dao.UserDao;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.monimybatis
 * @Author: zhanglang
 * @CreateTime: 2020-03-26 12:00
 * @Description:
 */
public class MyFactoryBean implements FactoryBean, InvocationHandler {
    Class clazz;
    public MyFactoryBean(Class clazz){
        this.clazz = clazz;
    }
    @Override
    public Object getObject() throws Exception {
        Class[] classes = new Class[]{clazz};
        Object proxyObject = Proxy.newProxyInstance(this.getClass().getClassLoader(),classes,this);
        return proxyObject;
    }

    @Override
    public Class<?> getObjectType() {
        return clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy");
        Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName());
        Select select = method1.getDeclaredAnnotation(Select.class);
        String[] strs = select.value();
        System.out.println(strs[0]);
        return null;
    }
}
