package com.zhanglang.aop01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.aop01
 * @Author: zhanglang
 * @CreateTime: 2020-04-03 11:51
 * @Description:
 */
@EnableAspectJAutoProxy
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);


    }
}
