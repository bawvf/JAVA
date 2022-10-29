package _9_TreeSet集合;

import java.util.TreeSet;

public class Demo002 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<Person>();

        Person p1 = new Person("张三",19);
        Person p2 = new Person("王五",21);
        Person p3 = new Person("李四",20);

        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        System.out.println(ts);
    }
}
