package com.dywy.yuanze;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.dywy.yuanze
 * @Author: zhanglang
 * @CreateTime: 2020-09-11 13:59
 * @Description: 依赖倒置原则
 */
public class YilaiDaozhi {
    public static void main(String[] args) {
        /**
         * 1.高层模块不应该依赖低层模块(实现类),应该依赖低层模块的抽象
         * 2.抽象不依赖具体
         *
         * 高层模块:处理负载业务的模块  底层模块:给高层模块提供某一方面功能的实现类
         */
        Diaoyong diaoyong = new Diaoyong();
        // 错误示范，此处Diaoyong是高层模块，依赖了ServiceYilaiImpl1是底层模块(具体实现)
        diaoyong.say(new ServiceYilaiImpl1());
        // 改进方案 所有实现相同特性的依赖一个接口ServiceYilai
        // Diaoyong2的say(ServiceYilai serviceYilai) 依赖的是实现类的抽象接口，
        Diaoyong2 diaoyong2 = new Diaoyong2();
        diaoyong2.say(new ServiceYilaiImpl1());

    }
}

interface ServiceYilai{
    public void say();
}

class Diaoyong2{
    public void say(ServiceYilai serviceYilai){
        serviceYilai.say();
    }
}

class Diaoyong{
    public void say(ServiceYilaiImpl1 impl1){
        impl1.say();
    }
}

class ServiceYilaiImpl1 implements ServiceYilai{
    public void say(){
        System.out.println("impl 1 ...");
    }
}

class ServiceYilaiImpl2 implements ServiceYilai{
    public void say(){
        System.out.println("impl 2 ...");
    }
}
