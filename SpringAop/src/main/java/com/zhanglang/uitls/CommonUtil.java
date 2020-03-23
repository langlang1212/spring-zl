package com.zhanglang.uitls;

import com.zhanglang.anno.Entity;

import java.lang.annotation.Annotation;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 16:47
 * @Description:
 */
public class CommonUtil {

    public static String buildQuerySqlForEntity(Object object){
        Class clazz = object.getClass();

        // 1、判断是否加了这个注解
        System.out.println(clazz.isAnnotationPresent(Entity.class));
        if(clazz.isAnnotationPresent(Entity.class)){
            // 2、得到注解
            Entity entityAnno = (Entity) clazz.getAnnotation(Entity.class);
            // 3、调用方法
            String value = entityAnno.value();
            System.out.println(value);
        }
        return "";
    }
}
