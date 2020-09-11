package com.zhanglang.practice;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.practice
 * @Author: zhanglang
 * @CreateTime: 2020-04-03 09:24
 * @Description:
 */
@Component
public class IndexDaoB implements Dao {
    @Override
    public void say() {
        System.out.println("BBBB");
    }
}
