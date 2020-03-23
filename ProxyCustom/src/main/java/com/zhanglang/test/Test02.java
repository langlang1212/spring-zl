package com.zhanglang.test;

import com.zhanglang.dao.ParamDao;
import com.zhanglang.dao.ParamDaoImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.test
 * @Author: zhanglang
 * @CreateTime: 2020-03-20 16:48
 * @Description:
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ParamDao paramDao = new ParamDaoImpl();
        Class clazz = paramDao.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            Class[] paramTypes = method.getParameterTypes();
            Object[] objs = {"hello"};
            Method method1 = clazz.getDeclaredMethod("say",paramTypes);
            Object invoke = method1.invoke(paramDao, objs);
            System.out.println(invoke);
        }
    }
}
