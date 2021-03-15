package loop;

public class ForDemo02 {
    /*
    1
    求100 - 999 的水仙花数
    水仙花数：各个位数的立方和等于原数
    */
    public static void flower() {
        int gewei, shiwei, baiwei;
        for (int i = 100; i <= 999; i++) {
            gewei = i % 10;
            shiwei = i / 10 % 10;
            baiwei = i / 10 / 10 % 10;
            if (gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei == i) {
                System.out.println(i + "是水仙花数");
            }
        }
    }

    /*
    2
    统计水仙花数一共有多少个
    */

    public static void flowerCount() {
        int gewei, shiwei, baiwei, count = 0;
        for (int i = 100; i <= 999; i++) {
            gewei = i % 10;
            shiwei = i / 10 % 10;
            baiwei = i / 10 / 10 % 10;
            if (gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei == i) {
                count++;
            }
        }
        System.out.println("水仙花数是" + count + "个");
    }

    public static void main(String[] args) {
        flower();
        System.out.println("--------------");
        flowerCount();
    }
}




