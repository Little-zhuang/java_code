package com.array;

/**
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class ArrayDemo04 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

//        printArr(arr);
        printArr(reverseArr(arr));
    }


    //遍历输出数组的内容
    public static void printArr(int[] arrays){
        for (int i : arrays) {
            System.out.print(i + " ");
        }
    }


    //将数组中的内容倒序输出
    public static int[] reverseArr(int[] arrays){
        int[] result = new int[arrays.length];

        //result.length = 5，for循环遍历是从0开始的，故长度要减1，否则就会报错数组下标越界
        for (int i = 0, j = result.length-1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }

        return result;
    }
}
