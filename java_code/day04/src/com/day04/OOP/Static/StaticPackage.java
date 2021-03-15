package com.day04.OOP.Static;

//直接导入包会报错（Cannot resolve symbol 'random）
//加上static修饰符将包变成静态包就可以解决问题
import static java.lang.Math.random;

/**
 * static 静态包
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class StaticPackage {

    public static void main(String[] args) {

//      没有导入包(调用必须使用 类名.方法名())
        System.out.println(Math.random());

//      导入包(调用直接 方法名())
        System.out.println(random());
    }
}
