package com.zhanglang.service;

import com.zhanglang.ioc.SpringDao;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.service
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 10:39
 * @Description:
 */
@Service
public class IndexService {

    private SpringDao dao;

    public void setDao(SpringDao dao){
        this.dao = dao;
        System.out.println("是否装配");
    }

    public void say(){
        System.out.println("hehe");
    }
}
