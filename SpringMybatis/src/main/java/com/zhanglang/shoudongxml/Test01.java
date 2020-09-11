package com.zhanglang.shoudongxml;

import com.zhanglang.config.Appconfig;
import com.zhanglang.dao.mapper.SysMerchantMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.io.InputStream;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.shoudongxml
 * @Author: zhanglang
 * @CreateTime: 2020-03-31 11:36
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * 1、springioc是什么?SpirngBean的创建过程?我们程序员可以在实例化bean过程中可以在哪里干扰bean的创建(列举一到两个)?
         * 2、BeanFactory和FactoryBean的区别?MyBatis作为外部框架，怎么注入spring的?
         * 3、springaop是什么?如果我DaoImpl implements Dao  Dao dao = (Dao)context.getBean(Dao.class); System.out.pringln(dao instance DaoImpl)是true还是false?
         * 4、mybatis+log4j可以打印日志  mybatis+spring5+log4j就不能打印日志了?为什么spring使用mybatis的时候一级缓存会失效?
         * 因为spring-jcl，默认用的jul，默认级别info以上
         * 因为sqlsessiontemplate调用代理方法，最后把sqlsession关了?为什么要关?
         * spring和mybaits怎么做结合的?
         * 1、如果是普通mybatis对象
         * 2、跟spring：
         *     扫描
         *     扫描过后封装成bd,放到bdmap当中
         *     实例化时候new FactoryBean
         *     new 过后，调用InitializingBean的afterPropertiesSet(),等所有依赖处理完成过后调用。在@PostConstructor之后
         */
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        //annotationConfigApplicationContext.register(SysMerchantMapper.class);
        SysMerchantMapper sysMerchantMapper = annotationConfigApplicationContext.getBean(SysMerchantMapper.class);

        System.out.println(sysMerchantMapper.list());
        //System.out.println(sysMerchantMapper.list());
    }
}
