package com.zhanglang.zhongyao01;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.zhongyao01
 * @Author: zhanglang
 * @CreateTime: 2020-04-01 10:56
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(ZhangBeanDefinitionRegistrar.class)
public @interface ZhangScan {
}
