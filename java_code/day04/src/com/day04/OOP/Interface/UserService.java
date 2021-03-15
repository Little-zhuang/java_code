package com.day04.OOP.Interface;

/**
 * interface 接口:
 * 1. 接口用interface修饰；
 * 2. 接口都要有实现类；
 * 3. 接口是专业的抽象，只能定义方法约束（规范），不能写具体方法；
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public interface UserService {

    /**
     * 注意：
     * 1. 接口中定义的属性都是静态公开常量 public static final  （public static final 可以不用写）
     * 2. 接口中的所有定义的方法都是公开抽象的 public abstract （public abstract可以不用写）
     * 3. 接口定义方法：返回值类型 接口名称();
     */

    public static final int AGE = 18;

    public abstract void add();
    public abstract void delete();
    public abstract void update();
    public abstract void query();
}
