package com.Exception.test;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-12:34
 */
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;


        //选中要监视的代码块 ctrl + Alt + T
        try {
            System.out.println(a / b);
        } catch (Exception exception) {
            exception.printStackTrace();    //打印错误的栈信息(错误内容)
        } finally {
            System.out.println("finally");
        }
    }

}
