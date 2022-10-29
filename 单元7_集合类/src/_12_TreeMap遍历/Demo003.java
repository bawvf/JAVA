package _12_TreeMap遍历;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo003 {
    public static void main(String[] args) {
        TreeMap<Teacher,String> tm = new TreeMap<Teacher,String>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Teacher s1 = new Teacher("张三",23);
        Teacher s2 = new Teacher("李四",25);
        Teacher s3 = new Teacher("王五",24);

        tm.put(s1,"基础班");
        tm.put(s2,"基础班");
        tm.put(s3,"就业班");

        System.out.println(tm);
    }
}
