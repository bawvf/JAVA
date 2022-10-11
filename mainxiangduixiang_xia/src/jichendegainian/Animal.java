package jichendegainian;

public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {}
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void eat() {
        System.out.println("吃饭了。。。。");
    }
}
