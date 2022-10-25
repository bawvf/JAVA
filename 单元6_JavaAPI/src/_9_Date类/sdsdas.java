package _9_Date类;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class sdsdas {
    public static void main(String[] args) {
        Calendar cc = Calendar.getInstance();
        cc.set(2022,11,23);
        System.out.println(cc);
        System.out.println(cc.getTime());
        SimpleDateFormat qwe = new SimpleDateFormat("yyy年MM月dd日");
        System.out.println(qwe.format(cc.getTime()));
    }
}
