package com.day04.OOP.Student;

/**
 * Student类
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class Student {

    //属性:字段 (属性默认是空)

    public String name;
    public String sex;
    public int age;

    //方法
    public void study(){
        System.out.println(this.name + "正在学习！");
    }

    public void print(){
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
    }
}
/**
 *       放在Application中测试
 *
 *       //类：抽象的 实例化
 *       //类实例化后会返回一个自己的对象
 *       //Lynn对象就是Student一个具体的对象
 *       Student Lynn = new Student();
 *       Lynn.name = "小琳";
 *       Lynn.sex = "女";
 *       Lynn.age = 3;
 *
 *       Lynn.print();
 *       Lynn.study();
 **/