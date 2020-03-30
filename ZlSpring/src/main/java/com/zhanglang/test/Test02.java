package com.zhanglang.test;

<<<<<<< HEAD
/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.test
 * @Author: zhanglang
 * @CreateTime: 2020-03-26 11:34
 * @Description:
 */
public class Test02 {
    public static void main(String[] args) {

=======
import org.spring.util.AnnotationConfigApplicationContext;

public class Test02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan("com.zhanglang.service");
>>>>>>> f5aababe23c54b4b45780e9194516ca1c5623e74
    }
}
