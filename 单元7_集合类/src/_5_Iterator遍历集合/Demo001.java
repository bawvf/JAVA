package _5_Iterator遍历集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Demo001 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        System.out.println(coll);       //[aaa, bbb, ccc, ddd]

        //使用迭代器对集合进行遍历
        //获取迭代器对象
        Iterator<String> it = coll.iterator();

        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }

//        //boolean hasNext(); 判断迭代器中是否还有下一个元素
//        boolean b = it.hasNext();
//        System.out.println(b);
//
//        //boolean hasNext(); 判断迭代器中是否还有下一个元素
//        b = it.hasNext();
//        System.out.println(b);
//        //E next(); 获取迭代器中下一个元素
//        String e = it.next();
//        System.out.println(e);      //aaa
//
//        //boolean hasNext(); 判断迭代器中是否还有下一个元素
//        b = it.hasNext();
//        System.out.println(b);
//        //E next(); 获取迭代器中下一个元素
//        e = it.next();
//        System.out.println(e);      //bbb
//
//        //boolean hasNext(); 判断迭代器中是否还有下一个元素
//        b = it.hasNext();
//        System.out.println(b);
//        //E next(); 获取迭代器中下一个元素
//        e = it.next();
//        System.out.println(e);      //ccc
//
//        //boolean hasNext(); 判断迭代器中是否还有下一个元素
//        b = it.hasNext();
//        System.out.println(b);
//        //E next(); 获取迭代器中下一个元素
//        e = it.next();
//        System.out.println(e);      //ddd
//
//        //boolean hasNext(); 判断迭代器中是否还有下一个元素
//        b = it.hasNext();
//        System.out.println(b);
//        //E next(); 获取迭代器中下一个元素
//        e = it.next();      //NoSuchElementException 没有搜索到元素异常
//        System.out.println(e);      //aaa


        //使用迭代器进行删除元素
        while (it.hasNext()) {
            String f = it.next();;
            if (f.equals("bbb")) {
                //coll.remove(e);
                it.remove();
            }
        }
        System.out.println(coll);
    }
}
