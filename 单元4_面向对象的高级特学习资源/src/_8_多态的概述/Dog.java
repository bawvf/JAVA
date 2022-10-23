package _8_多态的概述;

public class Dog extends Animal {
    int age = 5;

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
