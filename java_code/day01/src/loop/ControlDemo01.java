package loop;/*
跳转控制语句
continue 跳过本次循环，继续下一个循环
break 终止整个循环
*/


public class ControlDemo01 {

    //测试continue和break的区别
    public static void test() {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                //continue;
                //break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        test();
    }
}
