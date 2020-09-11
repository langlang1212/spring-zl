package com.zhanglang.service;

import com.mycustom.spi.Animal;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.service
 * @Author: zhanglang
 * @CreateTime: 2020-08-12 15:33
 * @Description:
 */
public class Tiger implements Animal {
    @Override
    public void say() {
        System.out.println("嗷嗷嗷...");
    }
}
