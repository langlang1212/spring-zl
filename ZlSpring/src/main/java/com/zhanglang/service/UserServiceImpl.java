package com.zhanglang.service;

import com.zhanglang.anno.Zhang;
import com.zhanglang.dao.UserDao;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.service
 * @Author: zhanglang
 * @CreateTime: 2020-03-22 20:53
 * @Description:
 */
@Zhang("service")
public class UserServiceImpl implements UserService {
    UserDao userDao;

    public void find() {
        System.out.println("sdfdsfdsfsdf");
    }

    /*public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }*/

}
