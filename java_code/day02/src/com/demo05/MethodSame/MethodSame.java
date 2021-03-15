package com.demo05.MethodSame;

/*
题目要求：定义一个方法，判断两个数字是否相同。
*/
public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(3,5));
        System.out.println("=========");
        System.out.println(isSame(4,4));
    }

    public static boolean isSame(int a, int b){
//      第一种写法
/*        boolean same;
        if(a == b) {
            same = true;
        }
        else {
            same = false;
        }*/

//      第二种写法
//        boolean same = a == b ? true : false;

//      第三种写法
//        boolean same = a == b;

//      第四种写法,直接返回
        return a == b;

//        return same;
    }
}
