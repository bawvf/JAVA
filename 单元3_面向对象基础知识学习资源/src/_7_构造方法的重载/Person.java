package _7_构造方法的重载;

public class Person {
//    成员变量：
    private String name;
    private int age;

//    无参构造方法：
//    public Person() {
//
//    }
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
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
//    成员方法：
    public void speak(){
        System.out.println("我的名字是：" + name + "," + "我的年龄是：" + age);
    }
}
