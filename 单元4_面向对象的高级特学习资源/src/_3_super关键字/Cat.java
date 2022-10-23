package _3_super关键字;

import _1_继承的概念.Animal;

public class Cat extends Animal {

    public Cat() {}
    public Cat(String name,int age,String color) {
        super(name, age, color);
    }

    @Override  //强制检查该方法是否是重写方法
    public void eat() {
        super.eat();
        System.out.println("猫吃鱼");
    }
}
