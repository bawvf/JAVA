package _2_变量的类型转换;

public class Demo001 {
    public static void main(String[] args) {
        //隐式转换
        byte num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println(sum);

        //强制转换
        int num11 = 10;
        int num22 = 20;
        byte sum_1 = (byte) (num11 + num22);
        System.out.println(sum_1);

        //常量优化机制
        byte sum_2 = 4 + 3;
        System.out.println(sum_2);
    }
}
