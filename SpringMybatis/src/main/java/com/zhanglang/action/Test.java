package com.zhanglang.action;

import com.zhanglang.config.Appconfig;
import com.zhanglang.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.action
 * @Author: zhanglang
 * @CreateTime: 2020-03-30 10:21
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        org.apache.ibatis.logging.LogFactory.useLog4JLogging();
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        IndexService indexService = annotationConfigApplicationContext.getBean(IndexService.class);
        System.out.println(indexService.list());
    }
}
