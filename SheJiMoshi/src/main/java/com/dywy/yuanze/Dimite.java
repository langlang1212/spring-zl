package com.dywy.yuanze;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.dywy.yuanze
 * @Author: zhanglang
 * @CreateTime: 2020-09-11 14:20
 * @Description: 迪米特法则(最少了解原则)
 * 父类的静态字段——>父类静态代码块——>子类静态字段——>子类静态代码块——>
 * 父类成员变量（非静态字段）——>父类非静态代码块——>父类构造器——>子类成员变量——>子类非静态代码块——>子类构造器
 */
public class Dimite {
    public static void main(String[] args) {
        /**
         * 一个对象应该和直接朋友联系，对其他类不要直接联系
         * 类的属性对象和方法中接收的参数对象称为直接朋友
         */
        SchoolManager schoolManager = new SchoolManager();
        // Employee是SchoolManager的直接朋友
        Employee employee = schoolManager.getEmployee();
        // CollegeManage是SchoolManager的直接朋友
        CollegeManage collegeManage = schoolManager.getCollegeManager();
        // 错误示例:CollegeEmployee不是SchoolManager的直接朋友
        CollegeEmployee collegeEmployee = collegeManage.getCollegeEmployee();


    }
}

class SchoolManager{
    public Employee getEmployee(){
        Employee employee = new Employee();
        return employee;
    }
    public CollegeManage getCollegeManager(){
        return new CollegeManage();
    }

}

class CollegeManage{
    public CollegeEmployee getCollegeEmployee(){
        return new CollegeEmployee();
    }
}
// 学院直接员工
class Employee{
    private String no;
    private String name;
}
// 分院员工
class CollegeEmployee{
    private String no;
    private String name;
}
