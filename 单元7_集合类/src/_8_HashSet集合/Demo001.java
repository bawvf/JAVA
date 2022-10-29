package _8_HashSet集合;

import java.util.HashSet;

public class Demo001 {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("Java");
        hs.add("Java");

        System.out.println(hs);
    }
}
