package _12_静态内部类;

public class Demo001 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.innerMethod();

    }
}
