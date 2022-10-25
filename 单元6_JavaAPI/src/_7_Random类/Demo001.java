package _7_Random类;

import java.util.Random;

public class Demo001 {
    public static void main(String[] args) {
        Random r = new Random();

        //boolean nextBoolean()
        System.out.println(r.nextBoolean());

        //double nextDouble()
        System.out.println(r.nextDouble());

        //float nextFloat()
        System.out.println(r.nextFloat());

        //int nextInt()
        System.out.println(r.nextInt());

        //int nextInt(int n)
        System.out.println(r.nextInt(10));
        //生成一个1-100之间的随机数
        System.out.println(r.nextInt(100) + 1);

        //long nextLong()
        System.out.println(r.nextLong());


        System.out.println("==================================");


        Random r2 = new Random(10);
        System.out.println(r2.nextInt());
    }
}
