package _9_TreeSet集合;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo003 {
    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<Teacher>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //按照年龄的升序排序
                int result = o1.getAge() - o2.getAge();
                return result;
            }
        });

        Teacher t1 = new Teacher("张三",19);
        Teacher t2 = new Teacher("王五",21);
        Teacher t3 = new Teacher("李四",20);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);

        System.out.println(ts);
    }
}
