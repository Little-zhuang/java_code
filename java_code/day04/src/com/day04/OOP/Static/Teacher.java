package com.day04.OOP.Static;

/**
 * static 常量
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class Teacher {
//  静态变量

    static int age;

//  非静态变量

    String name;

    public void run(){
        System.out.println("非静态方法！");
    }

    public static void go(){
        System.out.println("静态方法！");
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();

//      可通过类实例来访问非静态属性
        teacher.name = "Lose";
//      不能通过类实例来访问访问静态属性
//      teacher.age = 18

//      可以直接访问静态属性，或者通过类.静态属性访问
        age = 18;
        Teacher.age = 18;

//      非静态方法和静态方法也遵循上述规则

//      类实例来调用非静态方法
        teacher.run();
//      直接调用静态方法，或者通过类.静态方法调用
        Teacher.go();
        go();

    }
}
