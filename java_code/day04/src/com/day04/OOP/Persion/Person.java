package com.day04.OOP.Persion;

/**
 * 构造器
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class Person {

    public String name;

    // 实例化初始值
    // 1.使用new关键词，本质是调用构造器
    // 2.用来初始化值

    Person(){}

    // 有参构造
    // 定义有参构造后，无参构造必须显式定义

    public Person(String name){
        this.name = name;
    }

    // 构造器快捷键
    // alt + insert

}
/*
    构造器：
        1.和类名相同
        2.没有返回值
    作用：
        1.new的本质是调用构造器
        2.用来初始化对象的值
    注意：
        有参函数定义后，如果想使用无参函数，无参函数必须显示定义

    快捷键：
        alt + insert
        this. =
*/