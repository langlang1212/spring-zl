package com.zhanglang.log4jdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.log4jdemo
 * @Author: zhanglang
 * @CreateTime: 2020-03-29 20:23
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("log4j");
        log.debug("sdfsdf");
    }
}
