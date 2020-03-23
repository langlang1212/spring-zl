package com.zhanglang.handler;

import java.lang.reflect.Method;

public interface CoustomInvocationHandler {
    public Object invoke(Method method);
}
