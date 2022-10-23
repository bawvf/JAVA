package _9_对象的类型转换;

import _8_多态的概述.Animal;
import _8_多态的概述.Cat;
import _8_多态的概述.Dog;

public class Demo001 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
//        父类引用指向子类对象
//        Animal a = new Dog();
//        System.out.println(d.age);
//        System.out.println(a.age);
        method(d);
        _8_多态的概述.Cat c = new Cat();
        method(c);
    }

//    public static void method(Dog d ) {
//        d.eat();
//    }
//    public static void method(Cat c ) {
//        c.eat();
//    }
//    总写：
    public static void method(Animal a) {
        a.eat();
    }
}
