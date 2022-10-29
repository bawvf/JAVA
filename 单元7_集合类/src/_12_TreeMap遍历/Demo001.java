package _12_TreeMap遍历;

import java.util.TreeMap;

public class Demo001 {
    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap<String,String>();
        tm.put("hm002","张三");
        tm.put("hm003","李四");
        tm.put("hm001","王五");
        tm.put("hm004","赵六");

        System.out.println(tm);
    }
}
