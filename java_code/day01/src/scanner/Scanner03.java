package scanner;


import java.util.Scanner;

/**
 * @author Zhuang
 * @version 1.0
 * @since 1.8
 */
public class Scanner03 {

    public static void main(String[] args) {

//        demo01();
        demo02();
    }

    /**
     * 输出用户输入的内容，并且输出，只能输出一个内容
     *
     * @param i
     * @return
     */
    public static void demo01() {

        //从键盘接收一个数据
        Scanner s = new Scanner(System.in);
        System.out.println("请输入内容：");

        //判断是否还有输入数据
        if (s.hasNext()) {
            int i = s.nextInt();
            System.out.println(i);

            s.close();
        }
    }


    /**
     * 判断用户有没有输入对象，并且输出一行内容
     *
     * @param a
     * @return
     */
    public static void demo02() {
        //从键盘接收一个数据
        Scanner S = new Scanner(System.in);
        System.out.println("请输入内容：");

        //判断是否还有输入数据
        if (S.hasNextLine()) {
            String a = S.nextLine();
            System.out.println(a);

            S.close();
        }
    }
}
