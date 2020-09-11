package com.zhanglang.action;

import com.mycustom.MongoDBConnection;
import com.mycustom.spi.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.action
 * @Author: zhanglang
 * @CreateTime: 2020-08-12 14:47
 * @Description:
 */
@RestController
@RequestMapping(value = "/spring")
public class SpringSpiAction {

    @Autowired
    private MongoDBConnection mongoDBConnection;

    @Autowired
    private Animal animal;

    @GetMapping(value = "starterSpi")
    public void test(){
        System.out.println(mongoDBConnection.getConnection());

        animal.say();
    }
}
