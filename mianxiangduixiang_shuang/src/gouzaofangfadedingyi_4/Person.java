package gouzaofangfadedingyi_4;

public class Person {
    private String name;
    private int age;

    //空参构造方法
    public Person() {
        System.out.println("1234");
    }

    public Person(String n, int a) {
        System.out.println("1234111");
        name = n;
        age = a;
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

    //成员方法
    public void spack() {
        System.out.println("我的姓名是：" + name + ",我的年龄是：" + age);
    }
}
