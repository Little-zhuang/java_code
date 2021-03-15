package com.day04.OOP.Polymorphism;

/**
 * 多态
 * 子类继承自父类
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class Student extends Person{
    public void print(){
        System.out.println("son");
    }

    @Override
    public void eat() {
        System.out.println("Student eat");
    }
}
