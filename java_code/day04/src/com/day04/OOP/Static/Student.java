package com.day04.OOP.Static;

/**
 * static
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class Student extends Person{

    //2：赋初值
    {
        System.out.println("匿名代码块！");
    }

    //1：只加载一次
    static {
        System.out.println("静态代码块！");
    }

    //3.构造器
    public Student() {
        System.out.println("构造器！");
    }

    public static void main(String[] args) {
        Student student = new Student();

    }
}
