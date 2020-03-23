package com.zhanglang.ioc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.ioc
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 09:36
 * @Description:
 */
@Repository
public class SpringDaoImpl implements SpringDao {
    @Override
    public void say() {
        System.out.println("hello spring!");
    }
}
