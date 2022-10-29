package _2_List接口;

import java.util.ArrayList;
import java.util.List;

public class Demo001 {
    public static void main(String[] args) {
//        创建集合对象
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");

        //void add(int index,Object element) 将元素element插入在List集合的指定索引位置
        list.add(1,"ccc");
        System.out.println(list);       //[aaa, ccc, bbb]

        //Object get(int index) 返回集合索引index处的元素
        String str =  list.get(0);
        System.out.println(str);        //aaa

        //Object remove(int index) 删除index索引处的元素
        String del = list.remove(0);
        System.out.println(del);        //aaa
        System.out.println(list);       //[ccc, bbb]

        //Object set(int index,Object element) 将索引index处元素替换成element元素，并将替换后的元素返回
        String old = list.set(1,"ddd");
        System.out.println(old);        //bbb
        System.out.println(list);       //[ccc, ddd]

        //int indexOf(Object 0) 返回对象o在List集合中首次出现的位置索引
        int index = list.indexOf("ddd");
        System.out.println(index);      //1

        //int lastIndexOf(Object o) 返回对象o在List集合中最后一次出现的位置索引
        list.add("ddd");
        int last = list.lastIndexOf("ddd");
        System.out.println(last);


        //List subList(int fromIndex,int toIndex) 返回从索引fromIndex(包括)到toIndex(不包括)处所有元素集合组成的子集合
        List<String> list3 = list.subList(1, list.size());
        System.out.println(list3);

        //Object[] toArray() 将集合元素转换为数组
        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();

        //boolean addAll(int index,Collection c) 将集合c包含的所有元素插入到List集合的指定索引位置
        List<String> list2 = new ArrayList<String>();
        list2.add("aaa");
        list2.add("eee");
        list2.addAll(1,list);
        System.out.println(list2);      //[aaa, aaa, ccc, bbb, eee]


    }
}
