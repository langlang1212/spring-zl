package com.dywy.yuanze;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.dywy.yuanze
 * @Author: zhanglang
 * @CreateTime: 2020-09-11 13:54
 * @Description: 里式替换原则
 */
public class LishiTihuan {
    public static void main(String[] args) {
        /**
         * 在此处，子类覆写了父类的say(),
         * 所以say()的特性和父类的不一致了
         * 所以用到父类的地方不能被子类完全替代
         */
        Service service = new ServiceImpl();
        service.excute();
        service.say();
    }
}

abstract class Service{
    public abstract void excute();

    public void say(){
        System.out.println("service");
    }
}

class ServiceImpl extends Service{

    public void say(){
        System.out.println("service impl...");
    }

    @Override
    public void excute() {
        System.out.println("excute...");
    }
}
