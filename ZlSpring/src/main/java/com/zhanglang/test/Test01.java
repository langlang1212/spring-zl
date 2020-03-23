package com.zhanglang.test;

import com.zhanglang.service.UserService;
import com.zhanglang.service.UserServiceImpl;
import org.spring.util.BeanFactory;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.test
 * @Author: zhanglang
 * @CreateTime: 2020-03-22 20:55
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory("spring.xml");
        UserService userService = (UserService) beanFactory.getBean("service");
        userService.find();
    }
}
