package com.zhanglang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.config
 * @Author: zhanglang
 * @CreateTime: 2020-03-17 17:38
 * @Description:
 */
@Configuration
@ComponentScan("com")
/**
 * 对AsepectJ语法的支持  (proxyTargetClass = false)参数是是代理目标对象的方式，true:CGLIB,false:JDK Proxy
 * 1、如果目标对象实现了接口，默认情况下会采用JDK的动态代理实现AOP
 * 2、如果目标对象实现了接口，可以强制使用CGLIB实现AOP
 * 3、如果目标对象没有实现了接口，必须采用CGLIB库，spring会自动在JDK动态代理和CGLIB之间转换
 * 4、JDK基于聚合接口，CGLIB基于继承
 *
 * JDK动态代理和CGLIB字节码生成的区别？
 *  （1）JDK动态代理只能对实现了接口的类生成代理，而不能针对类
 *  （2）CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法
 *
 *  java是单继承的，所以一般用实现接口，JDK动态代理
 */
@EnableAspectJAutoProxy
public class Appconfig {
}
