package conversion;

public class Conversion {

    public static void main(String[] args){

        //自动类型转换 小范围转向大范围不报错

        double d = 10;
        byte b = 10;
        short s = b;
        int i = s;

        System.out.println(d);
        System.out.println(i);
        System.out.println("-----------");

        //强制类型转换 大范围转向小范围

        int I = 10;
        short S = (short) I;
        byte B = (byte)S;
        int k = (int)88.88;
        System.out.println(B);
        System.out.println(k);
    }
}
