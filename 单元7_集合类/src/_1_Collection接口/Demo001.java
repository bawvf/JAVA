package _1_Collection接口;

import java.util.ArrayList;
import java.util.Collection;

public class Demo001 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> list = new ArrayList<String>();
        //boolean add(Object o)向集合中添加一个元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println(list);       //  [aaa, bbb, ccc, ddd, eee]

        //int size() 获取该集合元素
        int length = list.size();
        System.out.println(length);

        //boolean isEmpty() 判断该集合是否为空
        boolean flag = list.isEmpty();
        System.out.println(flag);

        //boolean addAll(Collection c) 将指定集合c中的所有元素添加到该集合中
        Collection<String> list2 = new ArrayList<String>();
        list2.addAll(list);
        System.out.println(list2);      //  [aaa, bbb, ccc, ddd, eee]

        //void clear() 删除该集合中的所有元素
        list2.clear();
        System.out.println(list2);      //[]

        //boolean contains(Object o) 判断该集合中是否包含某个元素
        flag = list.contains("eee");
        System.out.println(flag);

        //boolean remove(Object o) 删除该集合中指定的元素
//        boolean b = list.remove("bbb");
//        System.out.println(b);
//        System.out.println(list);

        //boolean removeAll(Collection c) 删除该集合中包含指定集合c中的所有元素
        Collection<String> list3 = new ArrayList<String>();
        list3.add("aaa");
        list3.add("ccc");
        //将list集合中包含list3集合所有的元素都删除
//        list.removeAll(list3);
//        System.out.println(list);

        //boolean containsAll(Collection c) 判断该集合中是否包含指定集合c中的所有元素
        boolean flag1 = list.containsAll(list3);
        System.out.println(flag1);


    }
}
