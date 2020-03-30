package com.zhanglang.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.dao
 * @Author: zhanglang
 * @CreateTime: 2020-03-22 20:50
 * @Description:
 */
public interface UserDao {
    @Select("select * from ddd")
    public void query();

    @Select("select * from ddd")
    public void aaa();
}
