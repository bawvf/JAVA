package jichendegainian;
//super关键字
public class Demo003 {
    public static void main(String[] args) {
        Cat c = new Cat("布偶猫",2,"白色");
//        System.out.println(c.getName() + c.getAge() + c .getColor());
        System.out.println(c);
        c.eat();
    }
}
