/*

考试奖励案例
根据考试成绩的不同给出不同的奖励
*/

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {

        System.out.println("输入成绩：");

        //创建对象
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        //判断成绩，给出相应奖励
        if (score > 100 | score < 0) {
            System.out.println("成绩不正确！");
        } else if (score >= 90) {
            System.out.println("奖励一辆玩具小汽车");
        } else if (score >= 60 & score < 90) {
            System.out.println("奖励10块钱");
        } else {
            System.out.println("没有奖励");
        }
    }
}
