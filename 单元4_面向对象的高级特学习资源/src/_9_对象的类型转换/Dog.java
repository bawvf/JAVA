package _9_对象的类型转换;

import _8_多态的概述.Animal;

public class Dog extends Animal {
    int age = 5;

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
