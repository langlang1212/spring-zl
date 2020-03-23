package com.zhanglang.test;

import com.zhanglang.dao.ParamDao;
import com.zhanglang.dao.ParamDaoImpl;
import com.zhanglang.handler.MyParamInvocationHandler;
import com.zhanglang.handler.ParamInvocationHandler;
import com.zhanglang.handler.ZhangInvocationHandler;
import com.zhanglang.proxy.ProxyParamUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.test
 * @Author: zhanglang
 * @CreateTime: 2020-03-20 14:12
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        /*ParamDao paramDao = new ParamDaoImpl();
        Class clazz = paramDao.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        ParamInvocationHandler paramInvocationHandler = new MyParamInvocationHandler(paramDao);
        String[] strs = {"hello"};
        for(Method method : methods){
            paramInvocationHandler.invoke(method,strs);
        }*/

        ParamDao paramDao = (ParamDao) ProxyParamUtil.newInstance(ParamDao.class,new MyParamInvocationHandler(new ParamDaoImpl()));
        System.out.println(paramDao.say("hello"));

        /*String strs = "p0";
        Object[] objects = strs.split(",");
        for(Object o : objects){
            System.out.println(o);
        }*/


    }
}
