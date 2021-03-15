package loop;

/**
 * 增强型java for循环
 *
 *for(声明语句:表达式){
 *     循环体语句
 *}
 *
 * @author Elke
 */
public class ForDemo03 {
    public static void main(String[] args) {
        String[] s = {"python", "java", "c++", "c"};
        for(String i : s){
            System.out.println(i);
        }
    }
}
