package com.zhanglang.dao;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.dao
 * @Author: zhanglang
 * @CreateTime: 2020-03-23 10:32
 * @Description:
 */
public class UserDaoImpl1 implements UserDao {
    @Override
    public void query() {
        System.out.println("自动装配dao");
    }
}
