package _14_DateTimeFormatter类;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Demo001 {
    public static void main(String[] args) {
//        日期时间对象
        LocalDateTime ldt = LocalDateTime.now();

//        通过静态常量方式获取格式化对象
        DateTimeFormatter dtf1 = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println("使用静态常量方式进行格式化");
        String s = dtf1.format(ldt);
        System.out.println(s);

//        通过长格式方式获取格式化对象
        DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime((FormatStyle.LONG) );
        System.out.println("使用长格式方式进行格式化");
        s = dtf2.format(ldt);
        System.out.println(s);
    }
}
