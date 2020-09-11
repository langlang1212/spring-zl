package com.zhanglang.ioc;

import com.zhanglang.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.ioc
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 09:38
 * @Description:
 */
public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        IndexService bean = context.getBean(IndexService.class);
        bean.say();
        //SpringDaoImpl bean = context.getBean(SpringDaoImpl.class);
    }
}
