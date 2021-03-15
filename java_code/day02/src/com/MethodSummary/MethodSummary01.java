package com.MethodSummary;

/**
 * 方法总结
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class MethodSummary01 {
    public static void main(String[] args) {

    }

    /**
     * 方法定义格式：
     * 修饰符 返回值类型 方法名(...){
     *   方法体
     *   return 返回值;
     * }
     *
     * return 结束方法，返回运算值（可能为空，也可能是一个值）
     **/

    public String sayHello(String a){
        return a;
    }

    public void hello(){
        return;
    }

    public int max(int a, int b){

        //三元运算符
        return a > b ? a : b ;
    }

}
