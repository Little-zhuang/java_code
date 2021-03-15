package com.day04.OOP.Encapsulate;

/**
 * 封装
 * 1.提高程序的安全性，保护数据
 * 2.隐藏了代码的实现细节
 * 3.统一了接口(get、set)
 * 4.方便程序维护
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class Student {

    //属性私有 private关键字
    private String name;//姓名
    private String sex;//性别
    private long id;//学号
    private int age; //年龄

    //提供一些可以操作屬性的方法
    //提供一些public的get、 set方法

    //get   就是获得这个数据
    public String getName() {
        return this.name;

    }

    //set   给这个数据设置值
    //  可根据数据做安全的判断,等操作
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            this.age = 3;
        } else {
            this.age = age;
        }
    }
}

/*
    Student Lynn = new Student();
        Lynn.setName("Lynn");
        Lynn.setAge(18);
        Lynn.setSex("女");
        Lynn.setId(0526);

        System.out.println("name: " + Lynn.getName());
        System.out.println("id: " + Lynn.getId());
        System.out.println("sex: " + Lynn.getSex());
        System.out.println("age: " + Lynn.getAge());
*/