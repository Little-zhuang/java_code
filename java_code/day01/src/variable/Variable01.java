package variable;

/**
 * @author Elke
 */
public class Variable01 {

    public static void main(String[] args){

        //定义变量
        int i = 10;
        double d = 3.14;
        String S = "hello world";
        char c = '我';

        //确保是float类型
        float f = 13.14F;

        System.out.println(i);
        //输出变量
        System.out.println(d);
        System.out.println(S);
        System.out.println(c);
        System.out.println(f);

        //修改值

        i = 20;
        System.out.println(i);
    }
}
