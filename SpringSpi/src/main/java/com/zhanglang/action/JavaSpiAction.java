package com.zhanglang.action;

import com.mycustom.spi.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;
import java.util.ServiceLoader;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.action
 * @Author: zhanglang
 * @CreateTime: 2020-08-12 14:51
 * @Description:
 */
@RestController
@RequestMapping(value = "/java")
public class JavaSpiAction {

    @GetMapping(value = "/spi")
    public void test(){
        ServiceLoader<Animal> serviceLoader = ServiceLoader.load(Animal.class);
        for(Animal animal : serviceLoader){
            animal.say();
        }
    }
}
