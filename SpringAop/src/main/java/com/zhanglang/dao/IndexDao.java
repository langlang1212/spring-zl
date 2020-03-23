package com.zhanglang.dao;

import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.dao
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 17:40
 * @Description:
 */
//@Repository("indexDao")
@Repository
public class IndexDao implements Dao{
    public void query(){
        System.out.println("IndexDao query...");
    }
}
