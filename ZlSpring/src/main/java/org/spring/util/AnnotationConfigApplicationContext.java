package org.spring.util;

import com.zhanglang.anno.Zhang;

import java.io.File;

public class AnnotationConfigApplicationContext {

    public void scan(String basePackage){
        String rootPath = this.getClass().getResource("/").getPath();
        String basePackagePath = basePackage.replaceAll("\\.","\\\\");
        File file = new File(rootPath+"//"+basePackagePath);
        String[] names = file.list();
        for(String name: names){
            name = name.replaceAll(".class","");
            try {
                Class clazz = Class.forName(basePackage+"."+name);
                if(clazz.isAnnotationPresent(Zhang.class)){
                    Zhang zhang = (Zhang) clazz.getAnnotation(Zhang.class);
                    System.out.println(zhang.value());
                    System.out.println(clazz.newInstance());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
