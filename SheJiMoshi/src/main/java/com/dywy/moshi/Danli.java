package com.dywy.moshi;

import com.dywy.yuanze.DanyiZhize;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.dywy.moshi
 * @Author: zhanglang
 * @CreateTime: 2020-09-11 16:23
 * @Description:
 */
public class Danli {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);

        // 静态内部类获取单例
        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        System.out.println(singleton21==singleton22);
    }
}

/**
 * 双重检查模式,推荐使用
 */
class Singleton{
    // volatile是防止指令重排序,如果分配内存过后，没有初始化，会发生第二个线程判断singleton不为null的情况
    // static是保证内存中只存在一份实例
    private volatile static Singleton singleton;

    private Singleton(){}

    /**
     * sInstance =new Singleton();这句话创建了一个对象，他可以分解成为如下3行代码：
     *
     * memory = allocate();　　// 1.分配对象的内存空间
     * ctorInstance(memory);　　// 2.初始化对象
     * sInstance = memory;　　// 3.设置sInstance指向刚分配的内存地址
     * 　　上述伪代码中的2和3之间可能会发生重排序，重排序后的执行顺序如下
     *
     * memory = allocate();　　// 1.分配对象的内存空间
     * sInstance = memory;　　// 2.设置sInstance指向刚分配的内存地址，此时对象还没有被初始化
     * ctorInstance(memory);　　// 3.初始化对象
     * @return
     */
    public static Singleton getInstance(){
        // 判断对象是否存在
        if(singleton == null){
            // 这里是防止两个线程都通过判断对象是否存在
            synchronized (Singleton.class){
                /**
                 * 再次判断的原因:
                 * t1进入同步块，实例化instance,此时，t2通过同步块外的(singleton == null),在同步块外等待，
                 * t1实例化对象过后，释放锁，t2进来又实例化对象,为了防止重复创建，再检查一次
                 */
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

/**
 * 静态内部类实现单例,推荐使用
 */
class Singleton2{

    // 采用类装载的方式保证只会被初始化一次

    /**
     * 静态内部类方式在外部类装载时不会立即实例化，只有在getInstance()调用的时候才会装载SingletonInstance内部类，这样保证了懒加载
     * JVM装载静态属性的时候只会在第一次加载的时候完成初始化，JVM初始化的时候不允许其他线程进入，保证了线程安全
     */
    private static class SingletonInstance{

        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

/**
 * 枚举方式
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 */
 enum Singleton3 {
    INSTANCE;
    public void whateverMethod() {

    }
}
