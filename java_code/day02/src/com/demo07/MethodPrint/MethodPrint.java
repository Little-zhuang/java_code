package com.demo07.MethodPrint;
import java.util.Scanner;
/**
 *题目要求：打印指定数量的Hello World；
 * @author Elke
 */


public class MethodPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要打印的次数：");
        int x = sc.nextInt();
        print(x);
    }

    public static void print(int x){
        for (int i = 0; i < x; i++) {
            System.out.println("Hello World!");
        }
    }
}
