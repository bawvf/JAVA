package _3_super关键字;

import _1_继承的概念.Cat;
import _1_继承的概念.Dog;

public class Demo001 {
    public static void main(String[] args) {
//        创建猫类对象：
        Cat c = new Cat();
        c.setName("花");
        c.setAge(19);
        c.setColor("红色");
        c.eat();
        String name = c.getName();
        int age = c.getAge();
        String color = c.getColor();
        System.out.println(name + " " + age + " " + color);

        System.out.println("==================");

        Dog d = new Dog();
        d.setName("花草");
        d.setAge(20);
        d.setColor("绿色");
        d.eat();
        String name1 = d.getName();
        int age1 = d.getAge();
        String color1 = d.getColor();
        System.out.println(name1 + " " + age1 + " " + color1);
    }
}
