package com.day04.OOP.Extend;

/**
 * Person 人 ： 父类
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */

public class Person {

    //public
    //default
    //protected
    //private

    int money = 10_0000_0000;

    protected String name = "Person";

    //构造器
    public Person() {
        System.out.println("Person无参构造器执行了");
    }

    public void say(){
        System.out.println("Person 说了一句话！");
    }
}

