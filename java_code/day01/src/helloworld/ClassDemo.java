package helloworld;

//类名为 ClassDemo
public class ClassDemo {
    int ClassAge;
    //创建的类的类名要和主类类名一致 为Class

    public ClassDemo(String name){
        // 这个构造器仅有一个参数：name

        System.out.println("小狗的名字是：" + name);
    }
    public void setAge(int age){
        ClassAge = age;
    }
    public int getAge(){
        System.out.println("小狗的年龄是："+ ClassAge);
        return ClassAge;
    }
    public static void main(String[] args){

        //创建一个Class对象myClass
        ClassDemo MyClass = new ClassDemo("tony");
        MyClass.setAge(2);
        MyClass.getAge();
        System.out.println("变量值：" +MyClass.ClassAge);
    }
}

