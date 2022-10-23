package _10_成员内部类;

public class Demo001 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();

        oi.innerMedthod();
        System.out.println(oi.inner);
    }
}
