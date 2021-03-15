package operator;

/**
 * @author Elke
 */
public class Operator03 {

    public static void main(String[] args) {

        int i = 10;

        System.out.println("i = " + i);

        i+=20;

        System.out.println("i = " + i);

        short s = 10;

        //扩展的赋值运算包含强制类型转换
        s += 20;

        System.out.println("s = " + s);
    }
}
