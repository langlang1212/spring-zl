package com.zhanglang.monimybatis;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.monimybatis
 * @Author: zhanglang
 * @CreateTime: 2020-03-26 13:19
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface ZhangScan {
}
