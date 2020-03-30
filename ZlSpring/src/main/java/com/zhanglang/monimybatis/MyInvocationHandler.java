package com.zhanglang.monimybatis;



import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.monimybatis
 * @Author: zhanglang
 * @CreateTime: 2020-03-26 11:42
 * @Description:
 */
public class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy");

        return null;
    }
}
