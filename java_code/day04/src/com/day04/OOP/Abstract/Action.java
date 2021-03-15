package com.day04.OOP.Abstract;

/**
 * abstract 抽象类：类是单继承   extends是单继承 （接口可以多继承）
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public abstract class Action {

    /**
     *  加入 abstract 关键字后，方法变为抽象方法
     *  抽象方法：只定义方法的名字，不包括方法的实现
     */

    public abstract void goSomething();
    public void sayHello(){
        System.out.println("hello abstract!");
    }

    /**
     * 1.抽象类不能被new出来，只有方法被重写之后才可以实例化出来；  new A().goSomething(); 在非抽象子类A中重写类抽象方法，则可以实例化成功并调用；
     * 2.抽象方法只能存在在抽象类里面；
     * 3.抽象类中可以有正常的方法；
     * */
}
