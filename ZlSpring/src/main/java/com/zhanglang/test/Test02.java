package com.zhanglang.test;

import org.spring.util.AnnotationConfigApplicationContext;

public class Test02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan("com.zhanglang.service");
    }
}
