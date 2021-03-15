package com.array;


/**
 * @author Elke
 */
public class ArrayDemo01 {

    public static void main(String[] args) {

        //数组的静态初始化(创建+赋值)
        int[] arr1 = {1,2,3};
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);


        //数组的动态初始化，变量的赋值与输出
        int MAXSIZE = 10;
        int[] arr = new int[MAXSIZE];
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(arr[j]);
        }
    }
}
