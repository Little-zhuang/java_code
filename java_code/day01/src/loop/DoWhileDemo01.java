package loop;//先执行后判断条件是否满足

/**
 * @author Elke
 */
public class DoWhileDemo01 {

    //用do···while输出5次hello world!
    public static void hello() {
        int i = 0;
        do {
            System.out.printf("hello world!\t");
            i++;
        } while (i < 5);
    }

    public static void main(String[] args) {

        hello();
    }
}
