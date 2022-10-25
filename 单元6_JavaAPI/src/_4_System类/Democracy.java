package _4_System类;

//import javax.xml.crypto.Data;
//import java.util.Date;
//import java.util.Random;
//
//public class Democracy {
//    public static void main(String[] args) {
////        Random a = new Random();
////        System.out.println(a.nextInt());
////        System.out.println(a.nextInt(100));
////        System.out.println(a.nextDouble());
//        Date date1 = new Date();
//        System.out.println(date1);
//        Date date2 = new Date(System.currentTimeMillis() + 1000);
//        System.out.println(date2);
//        Date date3 = new Date(1000);
//        System.out.println(date3);
//
//    }
//}
import java.util.Calendar;
import java.util.Date;

public class Democracy {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calender = Calendar.getInstance();
        System.out.println(calender);

        int year = calender.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(calender.get(Calendar.MONTH)+1);
        System.out.println(calender.get(Calendar.DATE));
    }
}