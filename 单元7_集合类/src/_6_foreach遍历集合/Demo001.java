package _6_foreach遍历集合;

import java.util.ArrayList;
import java.util.Collection;

public class Demo001 {
    public static void main(String[] args) {
        //使用增强for循环遍历数组
        String[] arr = {"qqq","www","eee"};
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("==================");

        //使用增强for循环遍历集合
        Collection<Integer> coll = new ArrayList<Integer>();
        coll.add(100);
        coll.add(200);
        coll.add(300);
        coll.add(400);

        for (Integer i : coll) {
            System.out.println(i);
        }
    }
}
