package loop;

//先判断条件是否成立再执行循环
public class WhileDemo01 {

    //while循环输出5次hello
    public static void hello() {
        int i = 0;
        while (i < 5) {
            System.out.printf("hello world!\t");
            i++;
        }
    }

    //珠穆朗玛峰
    //一张0.1mm的纸连续对这多少次是珠穆朗玛峰的高度
    public static void peak() {
        double paper = 0.1;
        int p = 8844430;
        int count = 0;
        while (paper < p) {
            paper *= 2;
            count++;
        }
        System.out.printf("折叠次数是：" + count + "次");
    }

    public static void main(String[] args) {

        hello();
        System.out.printf("\n");
        peak();
    }
}
