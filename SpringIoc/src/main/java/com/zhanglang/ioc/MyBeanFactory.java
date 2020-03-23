package com.zhanglang.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.ioc
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 09:35
 * @Description:
 */
@Component
public class MyBeanFactory implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void say(){
        System.out.println("容器里面逻辑...");
        SpringDao bean = this.applicationContext.getBean(SpringDaoImpl.class);
        bean.say();
    }
}
