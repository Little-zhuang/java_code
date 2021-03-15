package helloworld;

public class demo {

    public int age;
    public String name;

    public void age(int Age){
        age = Age;
    }

    public void name(String NAME){
        name = NAME;
    }

    public void print(){
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }

    public static void main(String[] srgs){

        demo one = new demo();
        one.age(18);
        one.name("zhuang");
        one.print();
    }
}
