package com.zhanglang.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.anno
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 16:33
 * @Description: 自定义entity注解
 */
//定义注解的使用位置
@Target(value = {ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {

    // 加上default就可以注解的时候不指定value
    public String value() default "";

    public String name() default "";
}
