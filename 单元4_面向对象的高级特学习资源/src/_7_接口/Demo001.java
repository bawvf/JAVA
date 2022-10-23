package _7_接口;

public class Demo001 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.breath();
        d.getType("犬科");
        d.run();

        System.out.println(Animal.getId());
    }
}
