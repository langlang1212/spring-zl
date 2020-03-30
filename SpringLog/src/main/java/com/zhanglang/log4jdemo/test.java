package com.zhanglang.log4jdemo;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.log4jdemo
 * @Author: zhanglang
 * @CreateTime: 2020-03-29 17:57
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("xxx");
        log.info("xsfsdfsdf");


    }
}
