package _3_super关键字._6_抽象类;

public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {
    }
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();
    public void sleep() {
        System.out.println("睡觉了");
    }
}
