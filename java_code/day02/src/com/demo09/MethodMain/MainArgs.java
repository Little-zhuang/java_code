package com.demo09.MethodMain;

/**
 * 打印main方法中的args内容
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class MainArgs {
    public static void main(String[] args) {

        //args.length表示数组的长度
        for (int a = 0; a < args.length; a++) {
            String s = args[a];
            System.out.println(s);
        }
    }
}
