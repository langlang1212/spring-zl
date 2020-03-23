package com.zhanglang.test;


import com.zhanglang.dao.LubanDao;
import com.zhanglang.dao.LubanDaoImpl;
import com.zhanglang.dao.ParamDao;
import com.zhanglang.dao.ParamDaoImpl;
import com.zhanglang.handler.LubanInvocationHandler;
import com.zhanglang.handler.ZhangInvocationHandler;
import sun.misc.ProxyGenerator;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;


public class Test {
    public static void main(String[] args) {
//          //自定义
//        LubanDao proxy = (LubanDao) ProxyUtil.newInstance(LubanDao.class,new TestCustomHandler(new LubanDaoImpl()));
//        try {
//            proxy.proxy();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy18",new Class[]{LubanDao.class});

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("d:\\$Proxy18.class");
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //        System.out.println(proxy.proxy());
        /**
         * newProxyInstance
         *    getProxyClass0(loader, intfs)
         *          proxyClassCache.get(loader, interfaces)
         *              supplier.get() (内部类的synchronized V get())
         *                  内部类value = Objects.requireNonNull(valueFactory.apply(key, parameter));
         *                      proxy内部类ProxyClassFactory的public Class<?> apply(ClassLoader loader, Class<?>[] interfaces)，interfaceClass = Class.forName(intf.getName(), false, loader);用传过来的类加载器再加载一遍，判断是不是同一个类
         *                      byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
         *                      proxyName, interfaces, accessFlags); 生成指定的代理类
         *                          generateProxyClass(proxyName, interfaces, accessFlags);
         *
         */
        ParamDao paramDao = (ParamDao) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{ParamDao.class},new ZhangInvocationHandler(new ParamDaoImpl()));

        //jdkproxy.query();
        try {
            System.out.println(paramDao.say("hello world"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
