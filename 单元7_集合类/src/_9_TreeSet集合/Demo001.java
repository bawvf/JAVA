package _9_TreeSet集合;

import java.util.TreeMap;
import java.util.TreeSet;

public class Demo001 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(12);
        ts.add(16);
        ts.add(15);
        ts.add(13);
        ts.add(14);

        System.out.println(ts);     //[12, 13, 14, 15, 16]


    }
}
