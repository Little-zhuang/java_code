package com.day04.OOP.Class.demo1;

/**
 * 内部类~
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class Outer {

    /**
     * 外部类内容
     */
    private int id = 10;
    public void out(){
        System.out.println("这是外部类的方法！");
    }

    /**
     * 内部类
     */

    public class inner{
        public void in(){
            System.out.println("这是内部类的方法！");
        }

        //内部类可以直接获取外部类的私有属性
        public void getId(){
            System.out.println(id);
        }
    }


}
/**
 *         实例化外部类
 *         Outer outer = new Outer();
 *         outer.out();
 *
 *         实例化内部类(先实例化外部类，子啊通过外部类的实例化对象来实例化内部类)
 *         Outer.inner inner = outer.new inner();
 *         inner.in();
 *         inner.getId();
 */

