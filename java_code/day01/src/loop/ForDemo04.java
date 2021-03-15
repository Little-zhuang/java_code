package loop;

/**
 * 打印九九乘法表
 *
 * @author Elke
 * @version 1.0
 * @since 1.8
 */

public class ForDemo04 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        int i, j;
        for (i = 1; i < 10; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
