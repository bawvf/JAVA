package _7_JDK8_forEach遍历集合;

import java.util.ArrayList;
import java.util.Collection;

public class Demo001 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //JDK 8版本以后的forEach()方法遍历集合
        coll.forEach((String e) -> {System.out.println(e);});
    }
}
