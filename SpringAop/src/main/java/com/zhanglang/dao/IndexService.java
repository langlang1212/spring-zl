package com.zhanglang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.dao
 * @Author: zhanglang
 * @CreateTime: 2020-04-03 09:18
 * @Description:
 */
@Service
public class IndexService {

    @Autowired
    private Map<String,Dao> map ;

    public void say(){
        System.out.println("dsfdsfdsfsd");
    }
}
