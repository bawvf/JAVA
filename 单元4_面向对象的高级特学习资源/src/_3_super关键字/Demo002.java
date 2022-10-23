package _3_super关键字;

import _2_重写父类方法.Cat;
import _2_重写父类方法.Dog;

public class Demo002 {
    public static void main(String[] args) {
        _2_重写父类方法.Cat c = new Cat();
        c.eat();

        Dog d = new Dog();
        d.eat();
    }
}
