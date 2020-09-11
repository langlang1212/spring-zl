package com.zhanglang.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.practice
 * @Author: zhanglang
 * @CreateTime: 2020-04-03 09:26
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        IndexService service = annotationConfigApplicationContext.getBean(IndexService.class);
        service.say();
    }
}
