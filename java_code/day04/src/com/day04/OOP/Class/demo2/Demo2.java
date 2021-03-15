package com.day04.OOP.Class.demo2;

/**
 * 不同的类
 * java中可以有多个class,但是只有一个public class
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class Demo2 {
    public static void main(String[] args) {
        //有名字初始化类
        Apple apple = new Apple();
        apple.eat();

        //没有名字初始化类（匿名初始化类），不用将实例保存在变量中
        new Apple().eat();

        //new 一个接口直接重写接口内容
        new UserService(){

            @Override
            public void print() {
                System.out.println("接口");
            }
        };


    }
}

/**
 * 这个class也可以写内容
 * 一般用来测试用，可以直接用，不用在public class里面调用
 */
class A {
    public static void main(String[] args) {
        System.out.println("这是内部类1");
    }
}

/**
 *也可以在main方法中实例化并且调用
 */
class Apple{
    public void eat(){
        System.out.println("eat");
    }
}

/**
 *接口
 */
 interface UserService{
    void print();
}