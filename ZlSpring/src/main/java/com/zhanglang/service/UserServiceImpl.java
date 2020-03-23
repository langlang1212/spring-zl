package com.zhanglang.service;

import com.zhanglang.dao.UserDao;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.service
 * @Author: zhanglang
 * @CreateTime: 2020-03-22 20:53
 * @Description:
 */
public class UserServiceImpl implements UserService {
    UserDao userDao;

    /*public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }*/
    @Override
    public void find() {
        System.out.println("service");
        userDao.query();
    }
}
