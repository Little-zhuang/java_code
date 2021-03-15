package com.demo03.MethodParam;

/*
有参数；小括号里面有内容，当一个方法需要数据条件才能执行。例如两个数字相加，必须知道两个数字是多少
无参数；小括号里面没有内容，一个方法不需要任何数据条件，自己就可以独立完成。例如定义一个方法，打印固定10次HelloWorld,无参数，只要调用就可以打印10次
*/
public class DemoMethodParam {
    public static void main(String[] args) {
        method1(10, 20);
        System.out.println("============");
        method2();
    }

    //    打印两个数字相乘的结果
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    //    打印10次Hello World!
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!" + "第" + i + "次");
        }
    }
}
