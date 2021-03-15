package variable;

/**
 * @author Elke
 */
public class Employee {
//实例变量

    //变量的声明

    public String name;
    //私有变量对该类可见
    private int age;

    //函数的构造(对name赋值)
    public Employee(String eMpname) {
        name = eMpname;
    }

    //函数的构造(对age赋值)
//    public void age(int eMpAge){
//        age = eMpAge;
//    }

    //定义一个私有静态变量
    private static double sallory;

    //定义一个字符串常量String DEPARTMENT
    //类变量被定义为 public static final时，常量名一般用大写
    public static final String DEPARTMENT = "开发人员";

    //函数的构造 输出函数
    public void printeMp() {
        System.out.println("这个员工的名字是：" + name);
        System.out.println("这个员工的年龄是：" + age);
    }

    public static void main(String[] args) {

        //实例化一个Employee对象eMpone并且对name赋值
        Employee eMpone = new Employee("zhuang");

        //调用age函数给age赋值
        eMpone.age = 18;

        //调用输出函数
        eMpone.printeMp();

        sallory = 1000;
        System.out.println(DEPARTMENT + "平均工资:" + sallory);

    }
}
