package com.zhanglang.test;

import com.zhanglang.config.Appconfig;
import com.zhanglang.dao.Dao;
import com.zhanglang.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.test
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 17:41
 * @Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        /**
         * 这里IndexDao加上接口了，运行会报错，以下跟源码查找原因
         *
         * 经过JDK动态代理过后，生成代理对象，代理对象也会实现Dao接口，所以代理对象可以instance Dao ,也可以 instance Proxt Object，但是不会等于IndexDao
         * CGLIB动态代理，生成代理对象是继承于目标对象的。
         */
        //IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class); // 如果是这个加上aop会报错
        //Dao indexDao = annotationConfigApplicationContext.getBean(Dao.class);
        Dao indexDao = (Dao) annotationConfigApplicationContext.getBean("indexDao");
        indexDao.query();
    }
}
