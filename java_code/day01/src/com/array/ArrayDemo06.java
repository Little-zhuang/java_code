package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Array类学习
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class ArrayDemo06 {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 456, 5352, 664, 243, 687};


        //打印出数组内容Arrays.toString
        System.out.println(Arrays.toString(a));


        //排序输出（排序是升序）
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));



        //for each遍历输出内容
        for (int i : a) {
            System.out.println(i);
        }

    }
}
