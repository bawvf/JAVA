package _12_DateFormat类;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Demo001 {
    public static void main(String[] args) throws ParseException {
        //创建一个完整版格式的格式化对象
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);

        //创建一个长格式的格式化对象
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);

        //创建一个标准格式的格式化对象
        DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);

        //创建一个短格式的格式化对象
        DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);

        //获取当前系统时间
        Date d = new Date();
        System.out.println("完整版格式：" + df1.format(d));
        System.out.println("长格式版：" + df2.format(d));
        System.out.println("标准版格式：" + df3.format(d));
        System.out.println("短格式版：" + df4.format(d));

        //将一个字符串类型的日期解析成日期对象
        String s = "2018年10月10日";
        Date d2 = df2.parse(s);
        System.out.println(d2);

    }
}
