package com.demo06.MethodSum;

/**
 *题目要求：
 *定义一个方法求出1~100之间所有数字的和值
 * @author Elke
 */
public class MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }
    public static int getSum(){
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        return result;
    }
}
