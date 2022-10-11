package jichendegainian;

public class Cat extends Animal{
    public Cat() {}
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void eat() {
        super.eat();
        System.out.println("猫吃鱼");
    }

    public String toString() {
        return "Cat [getName()=" + getName() + ", getAge()=" + getAge()
                + ", getColor(）=" + getColor() + "]";
    }
}
