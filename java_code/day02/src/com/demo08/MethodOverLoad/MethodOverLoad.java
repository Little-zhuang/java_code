package com.demo08.MethodOverLoad;

/*
方法的重载(overload):多个函数的名称一样，但是参数列表不一样
*/

/**
 * @author Elke
 * @version  1.0
 */

public class MethodOverLoad {

    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }

    public static int sum(int a, int b){
        System.out.println("两个参数的方法执行了！");
        int result = a + b;
        return result;
    }
    public static int sum(int a, int b, int c){
        System.out.println("三个参数的方法执行了！");
        int result = a + b + c;
        return result;
    }
    public static int sum(int a, int b, int c, int d){
        System.out.println("四个参数的方法执行了！");
        int result = a + b + c + d;
        return result;
    }
}
