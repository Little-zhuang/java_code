package loop;

//先判断条件是否成立再执行循环
public class ForDemo01 {

    //顺序输出1-5
    public static void esc() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    //倒序输出5-1
    public static void desc() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    //输出5次hello world!
    public static void Hello() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world!");
        }
    }

    //求1-5的和
    public static void sum() {
        int Sum = 0;
        for (int i = 1; i < 5; i++) {
            Sum += i;
            System.out.println(Sum);
        }
        System.out.println("1-5的和是：" + Sum);
    }

    //求1-10的偶数和
    public static void doubleSum(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                sum += i;
                System.out.println(sum);
            }
        }
        System.out.println("1-10之间的偶数和是："+sum);
    }
    public static void main(String[] args) {

        //调用方法
        esc();
        System.out.println("------------");
        desc();
        System.out.println("------------");
        Hello();
        System.out.println("------------");
        sum();
        System.out.println("------------");
        doubleSum();
    }
}
