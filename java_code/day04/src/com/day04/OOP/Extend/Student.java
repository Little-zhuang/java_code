package com.day04.OOP.Extend;

/**
 * Student 学生 ； 子类（派生类）
 * 可继承父类的的全部方法及公共的属性
 * 私有的内容无法被继承
 *
 * 构造器的调用：
 * 默认先调用父类的构造器
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */

public class Student  extends Person {
    private String name = "Student";

    //构造器
    public Student() {
        System.out.println("Student无参构造器执行了");
    }

    public void print(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    @Override
    public void say(){
        System.out.println("Student 说了一句话！");
    }

    public void print(){
        say();      //调用Student的say方法
        this.say();     //this调用Student(当前)类的say方法
        super.say();    //super调用Person(父)类的say方法
    }
}

/*
        Student student = new Student();
        student.say();
*/

/*
        Student student = new Student();
        student.print("Hello");
        student.print();
*/