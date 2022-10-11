package object;

public class Person {
    private String name;
    public int age;

    public Person() {
        super();
    }
    public Person(String name,int age) {
        super();
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

    @Override
    public String toString() {
        return name + age;
    }
}
