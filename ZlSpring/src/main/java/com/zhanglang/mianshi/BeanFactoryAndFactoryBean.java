package com.zhanglang.mianshi;

import com.zhanglang.config.Appconfig;
import com.zhanglang.dao.UserDao;
import com.zhanglang.dao.UserDaoImpl;
import com.zhanglang.mianshi.factorybean.DaoFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.mianshi
 * @Author: zhanglang
 * @CreateTime: 2020-03-23 14:16
 * @Description: BeanFactory和FactoryBean的区别
 */
public class BeanFactoryAndFactoryBean {
    public static void main(String[] args) {
        //BeanFactory beanFactory = new ClassPathXmlApplicationContext("xxx");
        /**
         * BeanFactory:spring当中的生产bean的一个工厂。
         * FactoryBean：声明一个bean
         * 1、<bean></>
         * 2、@Component
         * 3、@Configuration @Bean
         * 4、FactoryBean
         */
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        DaoFactoryBean daoFactoryBean = (DaoFactoryBean) annotationConfigApplicationContext.getBean("&daoFactoryBean");
        /**
         * FactoryBean拿出来的实际是里面的new UserDaoImpl()
         * 因为直接在spring注入一个复杂的springbean,会配置很复杂
         * 当我们一个类依赖关系很复杂的时候，而我们要向外部提供一个容易配置的bean，就可以用FactoryBean
         */
        daoFactoryBean.testBean();
        //UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean(UserDaoImpl.class);
        //userDao.query();

    }
}
