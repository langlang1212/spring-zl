package com.zhanglang.mianshi.factorybean;

import com.zhanglang.dao.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.mianshi.factorybean
 * @Author: zhanglang
 * @CreateTime: 2020-03-23 14:38
 * @Description:
 * 从IOC中取DaoFactoryBean这个对象是   &daoFactoryBean
 */
@Component
public class DaoFactoryBean implements FactoryBean {

    public void testBean(){
        System.out.println("FactoryBean UserDaoImpl");
    }

    @Override
    public Object getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDaoImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
