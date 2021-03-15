package com.day04.OOP.Class.demo3;


/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/28-23:05
 */
public class Demo3 {

    public static void main(String[] args) {
        method();
    }


    public static void method(){

        class A{
            //这是局部内部类
            public void run(){
                System.out.println("这是局部内部类");
            }
        }

        new A().run();
    }
}
