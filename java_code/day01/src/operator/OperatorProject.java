package operator;

/**
 * 案例1 两只老虎
 * 判断两只老虎体重是否相同(一只180kg 另一只200kg)
 * 相同返回true
 * 不同返回false
 *
 *
 * 案例2 三个和尚
 * 三个和尚，身高分别为165cm，180cm，195cm
 * 判断三个和尚中最高的一个
 *
 * @author Elke
 */
public class OperatorProject {
    public static void main(String[] args){

        //两只老虎
        int weight1 = 180;
        int weight2 = 200;

        boolean b = weight1 == weight2 ? true:false;

        System.out.println("两只老虎的体重相同："+ b );

        //三个和尚

        int height1 = 165;
        int height2 = 190;
        int height3 = 175;

        int max1 = height1 > height2 ? height1 : height2;
        int max2 = max1 > height3 ? max1 : height3;

        System.out.println("最高的是：" +max2);
    }
}
