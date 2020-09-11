package com.mycustom.spi;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.mycustom.spi
 * @Author: zhanglang
 * @CreateTime: 2020-08-12 14:55
 * @Description:
 */
public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("汪汪汪...");
    }
}
