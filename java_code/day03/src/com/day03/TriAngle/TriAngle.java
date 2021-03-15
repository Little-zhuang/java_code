package com.day03.TriAngle;

/**
 * 打印一个三角形
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class TriAngle {
    public static void main(String[] args) {
        getTriangle();
    }

    public static void getTriangle(){
        for (int i = 0; i < 5; i++) {

            //先打印出左上角的倒三角形
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            //打印左半部分的正三角形
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            //打印右半部分的正三角形
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
