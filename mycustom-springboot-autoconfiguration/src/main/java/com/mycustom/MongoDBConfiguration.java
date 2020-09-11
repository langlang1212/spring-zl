package com.mycustom;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.mycustom
 * @Author: zhanglang
 * @CreateTime: 2020-06-10 17:12
 * @Description:
 * @ConditionalOnBean         //	当给定的在bean存在时,则实例化当前Bean
 * @ConditionalOnMissingBean  //	当给定的在bean不存在时,则实例化当前Bean
 * @ConditionalOnClass        //	当给定的类名在类路径上存在，则实例化当前Bean
 * @ConditionalOnMissingClass //	当给定的类名在类路径上不存在，则实例化当前Bean
 */
@Configuration
// 注册配置类
@EnableConfigurationProperties(MongoDBProperties.class)
public class MongoDBConfiguration {

    @Bean
    public MongoDBConnection getConnection(){
        return new MongoDBConnection();
    }
}
