package com.zhanglang.shoudongxml;

import org.apache.ibatis.logging.Log;

import java.util.logging.Logger;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.shoudongxml
 * @Author: zhanglang
 * @CreateTime: 2020-03-31 10:20
 * @Description:
 */
public class ZhangLog implements Log {
    Logger logger = Logger.getLogger("zhanglang");
    private String s;

    public ZhangLog(String str){
        this.s = str;
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public void error(String s, Throwable e) {

    }

    @Override
    public void error(String s) {

    }

    @Override
    public void debug(String s) {
        logger.info(s);
    }

    @Override
    public void trace(String s) {

    }

    @Override
    public void warn(String s) {

    }
}
