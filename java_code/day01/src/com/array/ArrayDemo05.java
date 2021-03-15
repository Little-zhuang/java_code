package com.array;

/**
 * 二维数组
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class ArrayDemo05 {
    public static void main(String[] args) {

        //声明一个二维数组并且实例化一个对象
//        int[][] arrays = new int[4][4];

        int[][] arrays = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};

//        arrays = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }
}
