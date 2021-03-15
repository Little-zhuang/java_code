package operator;

/**
 * @author Elke
 */
public class Operator04 {
    public static void main(String[] args){

        //单独使用
        int i = 10;

        i ++;
        System.out.println("i ="+ i);

        ++i;
        System.out.println("i = "+ i);

        //参与操作使用

        int m = 10;
        int j = m++;
        System.out.println("j = "+ j);
        int q = ++m;
        System.out.println("q = "+ q);
    }
}
