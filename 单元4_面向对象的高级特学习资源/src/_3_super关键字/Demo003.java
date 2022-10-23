package _3_super关键字;

public class Demo003 {
    public static void main(String[] args) {
        Cat c = new Cat("mcq",19,"bdse");
        System.out.println(c.getName() + " " + c.getAge() + " " + c.getColor());
        c.eat();
    }
}
