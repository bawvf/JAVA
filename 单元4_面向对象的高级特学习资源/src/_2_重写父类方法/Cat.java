package _2_重写父类方法;

import _1_继承的概念.Animal;

public class Cat extends Animal {
    @Override  //强制检查该方法是否是重写方法
    public void eat() {

            System.out.println("猫吃鱼");
    }
}
