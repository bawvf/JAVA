package _3_ArrayList集合;

import java.util.ArrayList;

public class Demo001 {
    public static void main(String[] args) {
        //创建ArrayList集合对象
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //获取集合的长度
        int size = list.size();
        System.out.println("集合的长度是：" + size);

        //获取元素
        System.out.println(list);       //[aaa, bbb, ccc, ddd]
        System.out.println(list.get(0));//aaa
        System.out.println(list.get(1));//bbb
    }
}
