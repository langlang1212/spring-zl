package com.mycustom;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.mycustom
 * @Author: zhanglang
 * @CreateTime: 2020-06-10 17:10
 * @Description:
 */
@Component
public class MongoDBConnection {

    private long id;

    private String name;

    private String desc;

    public String getConnection(){
        return "我是mongodb 连接";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
