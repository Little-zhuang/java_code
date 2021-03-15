package random;//Random获取随机数


import java.util.Random;

/**
 * @author Elke
 */
public class RandomDemo01 {
    public static void main(String[] args) {

        //创建Random对象
        Random r = new Random();

        //循环获取10个随机数
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(100);

            //输出获取的随机数
            System.out.println("num：" + num);
        }
    }
}
