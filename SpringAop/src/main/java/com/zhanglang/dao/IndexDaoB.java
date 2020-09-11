package com.zhanglang.dao;

import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.dao
 * @Author: zhanglang
 * @CreateTime: 2020-04-03 09:17
 * @Description:
 */
@Repository
public class IndexDaoB implements Dao {
    @Override
    public void query() {
        System.out.println("BBBBB");
    }
}
