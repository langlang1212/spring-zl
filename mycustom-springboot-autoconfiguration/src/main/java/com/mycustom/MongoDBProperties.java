package com.mycustom;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.mycustom
 * @Author: zhanglang
 * @CreateTime: 2020-06-11 09:42
 * @Description:
 */
@ConfigurationProperties(prefix = "mongodb.conn")
public class MongoDBProperties {

    private String ip;

    private String port;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
