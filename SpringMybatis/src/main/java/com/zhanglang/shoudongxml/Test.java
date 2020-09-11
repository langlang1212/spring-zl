package com.zhanglang.shoudongxml;


import com.zhanglang.dao.mapper.SysMerchantMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.shoudongxml
 * @Author: zhanglang
 * @CreateTime: 2020-03-31 09:43
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        // 手动使用mybatis加载mapper调用方法
        LogFactory.useCustomLogging(ZhangLog.class);
        String resources = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.getConfiguration().addMapper(SysMerchantMapper.class);
        //sqlSession.getConfiguration().setLogImpl(ZhangLog.class);
        SysMerchantMapper mapper = sqlSession.getMapper(SysMerchantMapper.class);
        System.out.println(mapper.list());

    }
}
