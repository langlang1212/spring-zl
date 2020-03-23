package com.zhanglang.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.handler
 * @Author: zhanglang
 * @CreateTime: 2020-03-20 10:10
 * @Description: 自定义实现JDK动态代理
 */
public class ZhangInvocationHandler implements InvocationHandler {
    Object target;
    public ZhangInvocationHandler(Object target){
        this.target = target;
    }
    /**
     *
     * @param proxy 代理对象
     * @param method 目标对象需要执行的方法
     * @param args 执行方法要传的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("自定义的实现JDK动态代理执行器。。。。");
        return method.invoke(target,args);
    }
}
