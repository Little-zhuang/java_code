package com.demo02.Method;

/*

方法定义完整格式:
修饰符 返回值类型 方法名称(参数类型1 参数名称1，参数类型2 参数名称2，······){
    方法体;
    return 返回值;
}
修饰符:现阶段的固定写法 public static
返回值类型: 方法最终产生的结果是什么类型的(int、 void、 double)
参数类型: 进入方法的数据是什么类型
参数名称: 进入方法的数据对应的变量名称
方法体: 方法需要做的事情，若干行代码
return: 两个用处，第一停止当前方法，第二将方法的结果返回给函数调用处
返回值: 方法执行后产生的数据结果

注意: return后面的“返回值”要和函数定义的数据类型相对应

方法的三种调用:
1、单独调用: 方法名(参数)
2、打印调用: System.out.println(方法名(参数))
3、赋值调用: 数据类型 数据名称 = 方法名(参数)

注意：返回值类型为void的方法只能单独调用，不能打印调用或者赋值调用
*/

//定义一个两个数字相加的方法
public class Demo02Method {
    public static void main(String[] args) {
//      单独调用（方法执行但是不显示结果）
        sum(3, 5);
        System.out.println("=============");
//      打印调用
        System.out.println(sum(3,5));
        System.out.println("=============");
//      赋值调用
        int number = sum(3, 5);
        System.out.println("变量的值:" + number);
    }
public static int sum(int a, int b){
    System.out.println("方法执行啦！");
        int result = a + b;
        return result;
}
}
