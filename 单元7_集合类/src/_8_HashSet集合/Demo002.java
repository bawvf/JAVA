package _8_HashSet集合;

import java.util.HashSet;

public class Demo002 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();
        Student s1 = new Student("张三",19);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("张三",19);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        //遍历集合
        for (Student s : hs) {
            System.out.println(s);
        }
    }
}
