package com.zhanglang.handler;

import java.lang.reflect.Method;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.handler
 * @Author: zhanglang
 * @CreateTime: 2020-03-20 13:57
 * @Description:  处理带参数的方法
 */
public interface ParamInvocationHandler {

    public Object invoke(Method method,Object[] args) throws Exception;

}
