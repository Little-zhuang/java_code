package scanner;/*

三个和尚升级版

输入三个和尚的身高，输出三个中最高的一个

*/
import java.util.Scanner;


public class Scanner02 {
    public static void main(String[] args){

        //创建对象
        Scanner sc = new Scanner(System.in);

        //分别写入数据
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();


        //三元运算选出最高的
        int temp = height1 > height2 ? height1:height2;
        int heighter = temp > height3 ? temp:height3;

        //输出最高的
        System.out.println("最高的是：" + heighter + "cm");
    }
}
