package com.Exception.TryCatchFinally;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-12:06
 */
public class TryCatchFinal {
    public static void main(String[] args) {

        try{    //代码监控区域，放置可能出现异常的代码
            new TryCatchFinal().run(1 , 0);

        }catch (ArithmeticException e){     //想要捕获的异常类型！（捕获异常）
            System.out.println("ArithmeticException");
        }finally {      //不管有没有异常，代码都会走到这一步，处理善后工作
            System.out.println("finally");
        }

        System.out.println("========================");
        //finally 可以不用写finally      假设IO，资源，关闭！

        try {
            new TryCatchFinal().a();
        }catch (Error error){
            System.out.println("Error");
        }catch (Exception exception){
            System.out.println("Exception");
        }catch (Throwable throwable){
            System.out.println("Throwable");
        }finally {
            System.out.println("程序出现异常，请尽快处理异常！ ");
        }


    }

    public void run( int a, int b){
        int result = a / b;
    }

    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
/**
 * 异常处理魔模块格式：
 * try{
 *     代码监视区域，监视可能出现异常的代码块
 * }catch( 异常类型  捕获异常){
 *
 * }catch( 异常类型  捕获异常){
 *
 * }finally{
 *     不管有没有异常，程序都会走到这里，一般处理异常程序的善后工作
 *     比如，IO文件  资源类的关闭等等
 * }
 *
 * 可以写多个catch模块来捕获不同的异常，多个catch书写，异常从上到下先写最小范围的异常，最后写最大范围的异常
 * Throwable(Exception(...),Error(...))
 */