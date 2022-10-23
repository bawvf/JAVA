package _3_super关键字;

import _1_继承的概念.Animal;

public class Dog extends Animal {
    @Override  //强制检查该方法是否是重写方法
    public void eat() {

        System.out.println("狗吃肉");
    }
}
