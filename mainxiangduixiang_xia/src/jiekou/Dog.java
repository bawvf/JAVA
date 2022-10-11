package jiekou;

public class Dog implements Anmial,LandAnmial{
    @Override
    public void breath() {
        System.out.println("1234");
    }

    @Override
    public void run() {
        System.out.println("4321");
    }
}
