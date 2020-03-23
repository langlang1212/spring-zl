package com.zhanglang.entity;

import com.zhanglang.anno.Entity;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.entity
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 16:31
 * @Description:
 */
@Entity(value = "user",name = "user")
public class UserEntity {
    @Entity(value = "fId")
    private String fId;

    private String fAccount;

    private String fUserPassword;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfAccount() {
        return fAccount;
    }

    public void setfAccount(String fAccount) {
        this.fAccount = fAccount;
    }

    public String getfUserPassword() {
        return fUserPassword;
    }

    public void setfUserPassword(String fUserPassword) {
        this.fUserPassword = fUserPassword;
    }
}
