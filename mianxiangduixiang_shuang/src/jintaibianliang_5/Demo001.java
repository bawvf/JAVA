package jintaibianliang_5;

public class Demo001 {
    public static void main(String[] args) {
        Student.schoolName = "1234";
        Student s1 = new Student();

        s1.setName("张三");
        s1.setAge(24);
//        s1.setSchoolName("1234");
        System.out.println(s1);

        System.out.println("============");

        Student s2 = new Student();

        s2.setName("李四");
        s2.setAge(24);
//        s2.setSchoolName("4321");
        System.out.println(s2);

        System.out.println("============");

        Student s3 = new Student();

        s3.setName("王五");
        s3.setAge(26);
//        s3.setSchoolName("2134");
        System.out.println(s3);
    }
}
