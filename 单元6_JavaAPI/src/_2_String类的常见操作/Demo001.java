package _2_String类的常见操作;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Demo001 {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        method4();
    }

    public static void method1() {
        String s = "HelloWorld";

        //1.判断功能

        //判断两个字符串是否相同，区分大小写
        boolean result = s.equals("HelloWorld");
        System.out.println(result);

        //判断两个字符串是否相同，不区分大小写
        result = s.equalsIgnoreCase("helloworld");
        System.out.println(result);

        //判断当前这个字符串是否以传入的字符串为开头
        result = s.startsWith("H");
        System.out.println(result);

        //断当前这个字符串是否以传入的字符串为结尾
        result = s.endsWith("d");
        System.out.println(result);

        //判断当前这个字符串是否包含传入的字符串
        result = s.contains("Hello");
        System.out.println(result);

        //判断字符串是否为空
        result = s.isEmpty();
        System.out.println(result);

    }

    public static void method2() {
        //2.获取功能
        String s = "HelloWorldjava";

        //int length();
        int length = s.length();
        System.out.println(length);

        //char charAt(int index)
        char ch = s.charAt(5);
        System.out.println(ch);

        //int indexOf(String s)
        int index = s.indexOf("l");
        System.out.println(index);

        //int lastIndexOf(String s)
        int index1 = s.lastIndexOf("l");
        System.out.println(index1);

        //String concat(String s)
        String news = s.concat("Int");
        System.out.println(news);

        //String substring(int index)
        String s2 = s.substring(10);
        System.out.println(s2);

        //String substring(int start,int end)
        String s3 = s.substring(5,10);
        System.out.println(s3);
    }

    public static void method3() {
        //3.转换功能
        String s = "HelloWorld";

        //char[] toCharArray();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //byte[] getBytes();
        byte[] arr2 = s.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        //String toUpperCase()
        String up = s.toUpperCase();
        System.out.println(up);

        //String toLowerCase()
        String low = s.toLowerCase();
        System.out.println(low);

        //String valueOF(int i);
        String s2 = String.valueOf(55);
        System.out.println(s2);
    }

    public static void method4() {
        //4.其他功能
        String s = "hello world java int";

        //String[] split(String regex);
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        //String trim()
        String s2 = "   He llo  ";
        System.out.println(s2.trim());
    }
}
