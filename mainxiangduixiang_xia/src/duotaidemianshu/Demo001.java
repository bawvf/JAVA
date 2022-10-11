package duotaidemianshu;

public class Demo001 {
    public static void main(String[] args) {
//        Anmial a = new Dog();
//
//        System.out.println(a.age);
        Dog d = new Dog();
        method(d);

        Cat c = new Cat();
        method(c);
    }
    public static void method(Dog d) {
        d.eat();
    }

    public static void method(Cat c) {
        c.eat();
    }

    public static void method(Anmial a) {
        a.eat();
    }
}

