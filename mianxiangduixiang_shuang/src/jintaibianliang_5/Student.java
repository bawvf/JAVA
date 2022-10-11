package jintaibianliang_5;

public class Student {
    private String name;
    private int age;
    static String schoolName;

    public Student() {}
    public Student(String name, int age, String schoolName) {
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

    public String toString() {
        return "Student [name" + name + ", age =" + age + ", schoolName =" + schoolName + "]";
    }
}
