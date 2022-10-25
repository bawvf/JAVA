package _8_包装类;

public class Demo001 {
    public static void main(String[] args) {
//        Integer i = 5;   //自动装箱的动作
//        System.out.println(i);
//
//        System.out.println(i + 5);  //自动拆箱动作

        Integer i1 = new Integer(5);
        Integer i2 = new Integer("5");

        System.out.println(i1 + i2);

        //int parseInt(String num);
        int num1 = Integer.parseInt("123");
        System.out.println(num1);

        //String toString()
        System.out.println(i1.toString());
        System.out.println(i2.toString());
    }
}
