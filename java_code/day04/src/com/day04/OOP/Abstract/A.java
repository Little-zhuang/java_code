package com.day04.OOP.Abstract;

/**
 * 抽象方法的继承
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class A extends Action{

    /**
     * 1.抽象类被子类继承后，非抽象子类必须重写其抽象类的抽象方法(方法约束)
     * 2.如果子类也是抽象类，则可以不用重写其父类抽象方法，让非抽象继承子类来重写
     * */

    @Override
    public void goSomething() {
        System.out.println("这是重写的抽象类方法！");
    }
}
