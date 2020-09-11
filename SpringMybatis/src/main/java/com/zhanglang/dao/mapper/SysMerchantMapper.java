package com.zhanglang.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.dao.mapper
 * @Author: zhanglang
 * @CreateTime: 2020-03-30 10:17
 * @Description:
 */
//@Mapper
public interface SysMerchantMapper {

    @Select("select * from sys_merchant")
    public List<Map<String,Object>> list();
}
