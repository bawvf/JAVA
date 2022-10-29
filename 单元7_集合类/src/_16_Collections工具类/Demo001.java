package _16_Collections工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo001 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        //static<T> boolean addAll(Collection<? super T> c, t... elements)
        //将所有指定元素添加到指定集合C中
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);       //[a, b, c, d]

        //static void reverse(List list) 反转指定List集合中元素的顺序
        Collections.reverse(list);
        System.out.println(list);       //[d, c, b, a]

        //staic void shuffle(List list) 对List集合中的元素进行随机排序
        Collections.shuffle(list);
        System.out.println(list);       //[c, a, d, b]

        //static void sort(List list) 根据元素的自然顺序对List集合中的元素进行排序
        Collections.sort(list);
        System.out.println(list);       //[a, b, c, d]

        //static void swap(List list,int i,int j) 将指定List集合中角标i和j的元素进行交换
        Collections.swap(list,0,3);
        System.out.println(list);       //[d, b, c, a]

        //static int binarySearch(List list,Object key)
        //使用二分法搜索指定对象在List集合中的索引，查找List集合中的元素必须是有序的
        int index = Collections.binarySearch(list,"c");
        System.out.println(index);      //2

        //static Object max(Collection col) 根据元素的自然顺序，返回给定集合元素中最大的元素
        String max = Collections.max(list);
        System.out.println(max);        //d

        //static Object min(Collection col) 根据元素的自然顺序，返回给定集合元素中最小的元素
        String min = Collections.min(list);
        System.out.println(min);        //a

        //static boolean replaceAll(List list,Object oldVal,Object newVal)
        //用一个新值newVal替换List集合中所有的旧值oldVal
        Collections.replaceAll(list,"b","f");
        System.out.println(list);       //[d, f, c, a]



    }
}
