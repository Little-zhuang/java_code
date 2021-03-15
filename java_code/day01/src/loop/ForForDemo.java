package loop;

//循环嵌套写出一天的时间
public class ForForDemo {

    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + "时" + minute + "分");
            }
        }
    }
}
