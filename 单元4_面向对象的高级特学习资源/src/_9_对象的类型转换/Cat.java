package _9_对象的类型转换;

import _8_多态的概述.Animal;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
