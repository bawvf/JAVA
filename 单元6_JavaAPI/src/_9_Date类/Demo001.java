package _9_Date类;

import java.util.Date;

public class Demo001 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(100000L);
        System.out.println(d2);
    }
}
