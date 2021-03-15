package com.Exception.MyException;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-15:33
 */
public class Test {

    public static void main(String[] args) throws MyException {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }

    static void test(int a) throws MyException{
        if(a > 10){
            throw new MyException();
        }

        System.out.println("OK!");
    }
}
