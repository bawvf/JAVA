package chouxianglei;

public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {
        super();
    }
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

    public abstract void eat();
    public void sleep() {
        System.out.println("睡觉");
    }
}
