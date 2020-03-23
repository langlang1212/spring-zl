package com.zhanglang.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.aspect
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 17:43
 * @Description:
 */
@Component
@Aspect //切面
public class ZhangAspect {

    // 切点
    @Pointcut("execution(* com.zhanglang.dao.*.*(..))")
    public void pointCut(){}

    // 前置通知
    @Before("pointCut()")
    public void before(){
        System.out.println("before ...");
    }
}
