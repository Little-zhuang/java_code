package com.MethodSummary;

/**
 * 方法的调用
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class MethodSummary02 {

    public static void main(String[] args) {

        //静态方法调用
        sayHello();
        Student.getMethod();

        //非静态方法的调用（必须先new一个对象，然后在调用）
        //对象类型 对象名 = new 对象类型
        Student student = new Student();
        student.sayHi();

        MethodSummary02 method = new MethodSummary02();
        method.sayHi();
    }

    /**
     * 静态方法 static
     * 可以通过类名直接调用
     * 类存在的时候就存在了
     */
    public static void sayHello() {
        System.out.println("这是静态方法的输出结果");

        //静态方法里面直接调用另一个非静态方法
        MethodSummary02 method = new MethodSummary02();
        method.sayHi();
        return;
    }

    /**
     * 非静态方法
     * 不能通过类名直接调用
     * 实例化之后类才存在
     */
    public void sayHi() {
        System.out.println("这是非静态方法的输出结果");

        //非静态方法里面直接调用另一个静态方法
        sayHello();
        return;
    }
}
