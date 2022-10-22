package _8_静态变量;

public class Student {
//    成员变量：
    private String name;
    private int age;
    private static String schoolName;

//    构造方法：
    public Student() {}
    public Student(String name,int age,String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + schoolName;
    }

}
