package random;//猜数字游戏
/*
系统随机生成一个1-100之间的数字，用户开始输入数字
根据输入数字的不同给出相应提示
如果输入的数字是系统生成的数字则输出并且终止循环
 */

import java.util.Scanner;
import java.util.Random;

/**
 * @author Elke
 */
public class RandomDemo02 {
    public static void main(String[] args) {

        Random r = new Random();
        int num = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.printf("请输入要猜的数字（1-100）:");
            int guessNum = sc.nextInt();

            if (guessNum < num) {
                System.out.println("猜的数字偏小了！");
            } else if (guessNum > num) {
                System.out.println("猜的数字偏大了！");
            } else {
                System.out.println("恭喜你猜中了！数字是：" + num);
                break;
            }
        }

    }
}
