package com.dywy.yuanze;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.dywy.yuanze
 * @Author: zhanglang
 * @CreateTime: 2020-09-11 10:03
 * @Description: 接口隔离原则
 */
public class JiekouGeli {
    public static void main(String[] args) {
        /**
         * 如果 方法sayA()和sayB()都放在一个接口类里面，Impl类实现接口类就必须实现所有方法，
         * 如果 某个实现类只想实现sayA()方法，就会强制实现不必要的sayB()方法
         * 所以要把接口方法细化，需要用到哪些方法，就用哪个接口
         */
    }
}


interface IntrA{
    public void sayA();
}

interface IntrB{
    public void sayB();
}

class Impl implements IntrA,IntrB{

    @Override
    public void sayA() {
        System.out.println("A");
    }

    @Override
    public void sayB() {
        System.out.println("B");
    }
}
