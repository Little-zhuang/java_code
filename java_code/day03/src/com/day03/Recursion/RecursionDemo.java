package com.day03.Recursion;

import java.util.Scanner;
/**
 * 利用递归函数算出5!
 * 递归：自己调用自己
 * 注意：必须有一个边界值(最小值)是知道的，否则会陷入死循环！
 *      适合基数比较小的内容
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class RecursionDemo {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("请输入要求的数字：");
        int x = Sc.nextInt();
        System.out.println(getRecursion(x));

    }


    /**
     * 1!  1
     * 2!  2*1!
     * 3!  3*2!(2*1!)
     * 4!  4*3！(3*2!(2*1!))
     * 5！ 5*4!(4*3!(3*2!(2*1!)))
     */
    public static int getRecursion(int i){
        if(i == 1){
            return 1;
        }else {
            return i * getRecursion(i-1);
        }
    }

}
