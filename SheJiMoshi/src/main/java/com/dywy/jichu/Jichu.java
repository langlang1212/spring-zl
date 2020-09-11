package com.dywy.jichu;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.dywy
 * @Author: zhanglang
 * @CreateTime: 2020-09-11 17:21
 * @Description: java基础记录
 */
public class Jichu {
    /**
     * 现在有两个Student对象：
     *
     *     Student s1=new Student("小明",18);
     *
     *     Student s2=new Student("小明",18);
     *
     * 此时s1.equals(s2)一定返回true
     *
     * 假如只重写equals而不重写hashcode，那么Student类的hashcode方法就是Object默认的hashcode方法，由于默认的hashcode方法是根据对象的内存地址经哈希算法得来的，显然此时s1!=s2,故两者的hashcode不一定相等。
     *
     * 然而重写了equals，且s1.equals(s2)返回true，根据hashcode的规则，两个对象相等其哈希值一定相等，所以矛盾就产生了，因此重写equals一定要重写hashcode，而且从Student类重写后的hashcode方法中可以看出，重写后返回的新的哈希值与Student的两个属性有关。
     *
     * 以下是关于hashcode的一些规定：
     *
     * 两个对象相等，hashcode一定相等
     *
     * 两个对象不等，hashcode不一定不等
     *
     * hashcode相等，两个对象不一定相等
     *
     * hashcode不等，两个对象一定不等
     */
}
