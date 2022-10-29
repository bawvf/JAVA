package _4_LinkedList集合;

import java.util.LinkedList;

public class Demo001 {
    public static void main(String[] args) {
        //创建LinkedList集合对象
        LinkedList<String> list = new LinkedList<String>();
        list.add("aaa");
        list.add("bbb");

        System.out.println(list);

        list.addFirst("ttt");
        System.out.println(list);       //[ttt, aaa, bbb]
        list.add(0,"qqq");
        System.out.println(list);       //[qqq, ttt, aaa, bbb]

















    }
}
