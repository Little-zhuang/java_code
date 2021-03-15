package com.day03.Break;

/**
 * break的练习，输出100内的前50个数
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */
public class DemoBreak {
    public static void main(String[] args) {
        getDouble();
    }

    public static void getDouble(){
        for (int i = 0; i < 100; i++) {

            //达到条件，用break终止循环
            if(i == 50){
                break;
            }
            System.out.print(i + "\t");
        }
    }
}
