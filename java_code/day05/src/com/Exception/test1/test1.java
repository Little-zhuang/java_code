package com.Exception.test1;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-15:14
 */

public class test1 {
    public static void main(String[] args) {
        try {
            new test1().run(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("程序异常了，加紧处理！");
        }
    }

    /**
     * throw:
     * 在定义方法中抛出异常
     * throws：
     * 方法解决不了的异常，向更高级抛出
     *
     * 主动抛出异常，一般用在方法中
     */
    public void run(int a,int b) throws ArithmeticException{
        if(b == 0){
            //throw
            throw new ArithmeticException();
        }
    }
}
