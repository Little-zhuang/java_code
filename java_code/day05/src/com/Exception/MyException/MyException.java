package com.Exception.MyException;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-15:31
 */
public class MyException extends Exception{
    //传递数字>10
    private int detail;

    //自定义异常信息
    public MyException(int a){
        this.detail = a;
    }

    public MyException() {}


    //异常打印出来
    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}


/**
 * 自定义异常：
 * 1.写一个异常类继承自Exception
 * 2.类中写自己的异常信息
 * 3.将异常信息打印出来的方法
 */