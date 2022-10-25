package _11_JDK_新增日期与时间类;

import java.time.*;

public class Demo001 {
    public static void main(String[] args) {
        //Clock 用于获取指定时区的当前日期，时间
        Clock clock = Clock.systemUTC();
        System.out.println("获取到的标注时间：" + clock.instant());
        System.out.println("获取到的毫秒数：" + clock.millis());

        //DayOfWeek枚举类，定义了一周七天周一到周日的枚举值
        System.out.println(DayOfWeek.WEDNESDAY);
        System.out.println(DayOfWeek.MONDAY);

        //Duration表示持续时间。该类提供的ofXxx()方法用于获取指定时间的小时、分钟、秒数等
        Duration d = Duration.ofDays(1);
        System.out.println("一天等于：" + d.toHours() + "小时");
        System.out.println("一天等于：" + d.toMinutes() + "分钟");
        System.out.println("一天等于：" + d.toMillis() + "秒");

        //Instant表示一个具体的时刻，可以精确到纳秒，提供了一个静态的now()方法来获取当前
        //当前时刻
        Instant i = Instant.now();
        System.out.println("当前时间：" + i);
        System.out.println("当前时间的一小时后：" + i.plusSeconds(3600));
        System.out.println("当前时间的一小时前：" + i.minusSeconds(3600));

        //LocalDate表示不带时区的日期，通过静态的now()方法来获取当前日期
        LocalDate Id = LocalDate.now();
        System.out.println("当前的日期是：" + Id);

        //Month枚举类，定义了一月到十二月的枚举值
        System.out.println(Month.JUNE);

        //MonthDay表示月日
        MonthDay md = MonthDay.now();
        System.out.println("当前的月份和日期：" + md);

        //Year单独表示年份
        System.out.println("当前的年份：" + Year.now());
    }
}
