package com.zhanglang.config;

import com.zhanglang.zhongyao01.ZhangScan;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.config
 * @Author: zhanglang
 * @CreateTime: 2020-03-30 09:55
 * @Description:
 */
@Configuration
@ComponentScan("com.zhanglang")
//@MapperScan("com.zhanglang.dao")
//@ZhangScan
public class Appconfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        driverManagerDataSource.setUrl("jdbc:sqlserver://39.105.222.40;DatabaseName=app_platform_test");
        driverManagerDataSource.setUsername("sa");
        driverManagerDataSource.setPassword("123456$ecs197");
        return driverManagerDataSource;
    }

    /**
     * 两种方式传dataSource
     * 1、参数直接传DataSource dataSource
     * 2、方法体set的时候调用dataSource()方法
     * @param dataSource
     * @return
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        // sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean;
    }
}
