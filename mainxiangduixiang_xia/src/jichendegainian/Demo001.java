package jichendegainian;

public class Demo001 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("波斯猫");
        c.setAge(2);
        c.setColor("黑色");
        Animal a = new Animal();

        System.out.println(c.getName() + c.getAge() + c.getColor());
        c.eat();

        System.out.println("=====================");

        Dog d = new Dog();
        d.setName("哈士奇");
        d.setAge(3);
        d.setColor("黑白色");

        System.out.println(d.getName() + d.getAge() + d.getColor());
        d.eat();
    }
}
