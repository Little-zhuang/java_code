package com.day03.VariableParameter;

/**
 * 利用可变参数选取最大值
 * 可变参数：在一个数据类型下面加三个小数点
 * 注意：一个方法中只能设置一个可变参数，不可存在多个可变参数
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class VbParameter {
    public static void main(String[] args) {

        //调用可变参数的方法
        printMax(12,33,15,27,36);
        printMax(new double[]{1,2,3});
    }

    public static void printMax(double... numbers) {
        if(numbers.length == 0){
            System.out.println("没有内容！");
            return;
        }
        double result = numbers[0];

        //排序
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("结果是：" + result);
    }

}
