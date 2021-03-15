package com.day03.Continue;

/**
 * 输出100内的偶数
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class DemoContinue {
    public static void main(String[] args) {
        getDouble();
    }

    public static void getDouble(){
        for (int i = 0; i < 100; i++) {

            //达到条件，用continue跳过条件体
            if(i % 2 == 1){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
