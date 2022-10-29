package _11_Map集合遍历;

import java.util.*;

public class Demo001 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("hm001","张三");
        hm.put("hm002","李四");
        hm.put("hm003","王五");

        //第一种方法：keySet()方法
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("=====================");

        //第二种方法：entrySet()方法
        Set<Map.Entry<String,String>> entrys = hm.entrySet();
        Iterator<Map.Entry<String,String>> it = entrys.iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("=====================");

        //第三种方式：forEach(BigConsumer) JDK 8
        hm.forEach((String key,String value) -> {System.out.println(key + "=" + value);});

        System.out.println("=====================");

        //第四种方法：values() JDK 8 获取map集合中所有的值，返回一个Collection集合中。forEach()方法
        Collection<String> values = hm.values();
        values.forEach((String value) -> {System.out.println(value);});

    }
}
