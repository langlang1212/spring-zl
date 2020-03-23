package com.zhanglang.dao;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.dao
 * @Author: zhanglang
 * @CreateTime: 2020-03-20 13:46
 * @Description: 手动实现动态代理带参数的方法
 */
public class ParamDaoImpl implements ParamDao{


    @Override
    public String say(String str) throws Exception {
        System.out.println("进入目标对象方法。。。");
        return str;
    }
}
