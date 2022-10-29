package _15_泛型;

import java.util.ArrayList;

public class Demo001 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(true);
        list.add("abc");
        list.add('a');

        //获取集合中字符串的长度
        for (int i = 0;i < list.size(); i++) {
            Object obj = list.get(i);
            String a = (String) obj;
            System.out.println(a.length());
        }
    }
}
