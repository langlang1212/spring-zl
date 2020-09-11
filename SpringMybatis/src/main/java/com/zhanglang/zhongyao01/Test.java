package com.zhanglang.zhongyao01;

import com.zhanglang.config.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.zhongyao01
 * @Author: zhanglang
 * @CreateTime: 2020-04-01 10:40
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(annotationConfigApplicationContext.getBean(UserClazz.class).getOrderClazz()+"==============");
    }
}
