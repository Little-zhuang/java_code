package operator;

/**
 * @author Elke
 */
public class Operator07 {

/** 短路运算符
 *  && 左边为真，右边执行，左边为假，右边不执行
 *  || 左边为假，右边执行，左边为真，右边不执行
 */
    public static void main(String[] args){
        int i = 10;
        int j = 20;
        int k = 30;

        // && 有false则false
        System.out.println((i > j) && (i < k));
        System.out.println((k < j) && (k < i));
        System.out.println((i < k) && (i < j));
        System.out.println("---------------");

        // || 有true则true
        System.out.println((i > j) || (i < k));
        System.out.println((k < j) || (k < i));
        System.out.println((i < k) || (i < j));
        System.out.println("---------------");


    }
}
