package com.zhanglang.service;

import com.zhanglang.dao.mapper.SysMerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.service
 * @Author: zhanglang
 * @CreateTime: 2020-03-30 10:19
 * @Description:
 */
@Service
public class IndexService {

    @Autowired
    private SysMerchantMapper sysMerchantMapper;

    public List<Map<String,Object>> list(){
        return sysMerchantMapper.list();
    }
}
