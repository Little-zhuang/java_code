package com.demo04.MethodReturn;

/*
题目要求：【求出】两个数字之和，将答案告诉调用者
题目变形：【打印】两个数字之和，答案不用告诉任何人
*/

public class MethodReturn {
    public static void main(String[] args) {
//      我是main方法，我来调用你，你将答案告诉num
        int num = getSum(10, 20);
        System.out.println(num);

        System.out.println("============");

        printSum(3, 7);
    }
//    有return,谁调用我，我就将答案告诉谁
    public static int getSum(int a, int b){
        int result = a + b;
        return result;
    }
//    没有return，我自己将答案打印输出
    public static void printSum(int a, int b){
        int num = a + b;
        System.out.println(num);
    }
}
