package _10_Calendar类;

import java.util.Calendar;
import java.util.Date;

public class Demo001 {
    public static void main(String[] args) {
        //获取日历对象 当前系统时间
        Calendar c = Calendar.getInstance();
//        System.out.println(c);

        //void setTime(Date d);
        Date d = new Date(100000L);

        //int get(int field)
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        int hour = c.get(Calendar.HOUR);
        System.out.println(hour);

        int minute = c.get(Calendar.MONTH);
        System.out.println(minute);

        int second = c.get(Calendar.SECOND);
        System.out.println(second);

        //void add(int fieid,int amount)
        c.add(Calendar.YEAR,1);
        System.out.println(c.get(Calendar.YEAR) + "年");

    }
}
