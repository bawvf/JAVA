package _12_TreeMap遍历;

import java.util.TreeMap;

public class Demo002 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<Student,String>();

        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",25);
        Student s3 = new Student("王五",24);

        tm.put(s1,"基础班");
        tm.put(s2,"基础班");
        tm.put(s3,"就业班");

        System.out.println(tm);
    }
}
