package com.zhanglang.config;

import com.zhanglang.monimybatis.MyImportBeanDefinitionRegistrar;
import com.zhanglang.monimybatis.ZhangScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.config
 * @Author: zhanglang
 * @CreateTime: 2020-03-23 14:42
 * @Description:
 */
@Configuration
@ComponentScan("com")
@ZhangScan
public class Appconfig {
}
