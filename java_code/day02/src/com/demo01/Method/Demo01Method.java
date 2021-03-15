package com.demo01.Method;

/*
写一个方法，打印出一个矩形

方法格式:
public static void 方法名称(){
    方法体
    }

方法调用:
方法名称();

注意事项:
1、方法定义的位置无所谓
2、方法定义不可以嵌套，必须是挨着的
3、方法不会自己执行，要想执行必须调用方法
*/

/**
 * @author Elke
 */
public class Demo01Method {

    public static void main(String[] args) {

//  调用方法
    angle();
    }

//  定义方法
    public static void angle() {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
