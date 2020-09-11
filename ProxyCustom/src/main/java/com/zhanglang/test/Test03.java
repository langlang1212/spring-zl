package com.zhanglang.test;

import com.zhanglang.dao.UserDao;
import com.zhanglang.dao.UserDaoImpl;
import com.zhanglang.handler.LubanInvocationHandler;
import com.zhanglang.handler.MyParamInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.test
 * @Author: zhanglang
 * @CreateTime: 2020-03-31 11:16
 * @Description:
 */
public class Test03 {
    public static void main(String[] args) {
        UserDao userDao = (UserDao) Proxy.newProxyInstance(Test03.class.getClassLoader(),new Class[]{UserDao.class},new LubanInvocationHandler(new UserDaoImpl()));
        userDao.query();
    }
}
