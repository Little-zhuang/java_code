package com.array;

/**
 * 稀疏矩阵
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class ArrayDemo07 {
    public static void main(String[] args) {

        //定义一个11*11的二维数组
        int[][] array01 = new int[11][11];

        array01[1][2] = 1;
        array01[2][3] = 2;


        //输出的原始矩阵
        System.out.println("输出的原始矩阵是：");
        for (int i = 0; i < array01.length; i++) {
            for (int j = 0; j < array01.length; j++) {
                System.out.print(array01[i][j] + "\t");
            }
            System.out.println();
        }

        //稀疏矩阵
        //1.先获取矩阵中的有效值
        int sum = 0;
        for (int i = 0; i < array01.length; i++) {
            for (int j = 0; j < array01[i].length; j++) {
                if (array01[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("矩阵中的有效值有" + sum + "个");
        System.out.println("======================");

        //2.构建稀疏矩阵
        System.out.println("稀疏矩阵：");

        int[][] array02 = new int[sum + 1][3];

        //系数矩阵格式
        array02[0][0] = 11;
        array02[0][1] = 11;
        array02[0][2] = sum;


        //3.遍历二维数组array01，将矩阵中的非0值存放在稀疏矩阵中
        int count = 0;
        for (int i = 0; i < array01.length; i++) {
            for (int j = 0; j < array01[i].length; j++) {
                if(array01[i][j] != 0){
                    count++;
                    array02[count][0] = i;
                    array02[count][1] = j;
                    array02[count][2] = array01[i][j];
                }
            }
        }

        //遍历输出稀疏矩阵内容
        for (int i = 0; i < array02.length; i++) {

            System.out.print(array02[i][0] + "\t" +
                    array02[i][1] + "\t" +
                    array02[i][2]);
            System.out.println();
        }

        //稀疏矩阵恢复为矩阵
        //1.先创建相对应的二维数组
        int[][] array03 = new int[array02[0][0]][array02[0][1]];


        //2.给矩阵赋值
        for (int i = 1; i < array02.length; i++) {
            array03[array02[i][0]][array02[i][1]] = array02[i][2];
        }

        System.out.println("======================");
        System.out.println("输出的还原矩阵是：");
        for (int i = 0; i < array03.length; i++) {
            for (int j = 0; j < array03.length; j++) {
                System.out.print(array03[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
