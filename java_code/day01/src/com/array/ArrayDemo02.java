package com.array;

import java.util.Scanner;

/**
 * 冒泡排序法
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class ArrayDemo02 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("请输入数组内容：");

        for (int i = 0; i < arr.length; i++) {
            arr[i] =  s.nextInt();
        }

//        sort(arr);
        bubble(arr);
    }


    /**
     * 冒泡排序法
     */
    public static void bubble(int[] arrays) {
        int temp;
        for (int i = 0; i < arrays.length; i++) {

            //排序完的步骤就不需要继续排序了，j < arrays.length - i - 1
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if(arrays[j] < arrays[j + 1]){
                    temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        for (int i: arrays
             ) {
            System.out.print(i + " ");
        }
    }

    /**
     * 输出一组数据中的最大值
     */
    public static void sort(int[] arrays) {
        int i;
        int max = arrays[0];

        for (i = 0; i < 8; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        System.out.println(max);
    }
}






