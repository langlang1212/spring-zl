package com.zhanglang.handler;

import java.lang.reflect.Method;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.handler
 * @Author: zhanglang
 * @CreateTime: 2020-03-20 13:59
 * @Description:
 */
public class MyParamInvocationHandler implements ParamInvocationHandler {
    Object target;
    public MyParamInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public String invoke(Method method,Object[] args) throws Exception {
        System.out.println("进入执行有参数方法的执行器...");
        return (String) method.invoke(target,args);
    }
}
