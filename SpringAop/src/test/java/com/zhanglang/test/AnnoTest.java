package com.zhanglang.test;

import com.zhanglang.uitls.CommonUtil;
import com.zhanglang.entity.UserEntity;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.test
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 16:51
 * @Description:
 */
public class AnnoTest {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        CommonUtil.buildQuerySqlForEntity(userEntity);
    }
}
