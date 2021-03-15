package operator;

/**
 * @author Elke
 */
public class Operator06 {
    public static void main(String[] args){

        int i = 10;
        int j = 20;
        int k = 30;

        // & 逻辑与运算,有false则false
        System.out.println((i > j) & (i < k));
        System.out.println((k < j) & (k < i));
        System.out.println((i < k) & (i < j));
        System.out.println("---------------");

        // | 逻辑或运算 有true则true
        System.out.println((i > j) | (i < k));
        System.out.println((k < j) | (k < i));
        System.out.println((i < k) | (i < j));
        System.out.println("---------------");

        // ^ 逻辑异或运算 结果相同为false，不同为true
        System.out.println((i > j) ^ (i < k));
        System.out.println((k < j) ^ (k < i));
        System.out.println((i < k) ^ (i < j));
        System.out.println("---------------");

        // ! 逻辑非运算 !i 结果和i相反
        System.out.println(!(i > j));
        System.out.println(!(k < j));
        System.out.println(!(i < k));
    }
}
