package _13_SimpleDateFormat类;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo001 {
    public static void main(String[] args) throws Exception {
        //公元----年--月--日 星期- --:--:--
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年MM月dd日 E HH:mm:ss");

//        格式化日期对象
        Date d = new Date();
        String s = sdf.format(d);
        System.out.println(s);

        System.out.println("================");

//        将一个字符串日期解析成日期对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2018-11-11";
        Date d2 = sdf2.parse(str);
        System.out.println(d2);
    }
}
