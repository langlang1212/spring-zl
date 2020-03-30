package com.zhanglang.monimybatis;

import com.zhanglang.config.Appconfig;
import com.zhanglang.dao.MyUserDao;
import com.zhanglang.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.monimybatis
 * @Author: zhanglang
 * @CreateTime: 2020-03-26 11:43
 * @Description:
 */
public class TestInject {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        UserDao bean = (UserDao) annotationConfigApplicationContext.getBean("userDao");
        bean.query();

    }
}
