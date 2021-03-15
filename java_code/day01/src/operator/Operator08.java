package operator;

/**
 *   三元运算符
 *
 *   格式 ： 关系表达式？表达式1：表达式2
 *   范例 ：a > b ? a : b;
 *   true 结果为a, false结果为b
 *
 * @author Elke
 */
public class Operator08 {
    public static void main(String[] args){

        int a = 10;
        int b = 20;
        int max = a > b ? a : b;

        System.out.println(a > b ? a : b);
        System.out.println(a < b ? a : b);
        System.out.println("max="+max);
    }
}
