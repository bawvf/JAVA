package _8_静态变量;

public class Demo001 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(19);
        s1.setSchoolName("清华大学");
        System.out.println(s1);
        System.out.println("==================");

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(20);
        //s2.setSchoolName("北京大学");
        System.out.println(s2);
        System.out.println("==================");

        Student s3 = new Student();
        s3.setName("王五");
        s3.setAge(21);
        //s3.setSchoolName("浙江大学");
        System.out.println(s3);
    }
}
