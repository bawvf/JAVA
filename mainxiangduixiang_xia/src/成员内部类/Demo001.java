package 成员内部类;

public class Demo001 {
    public static void main(String[] args) {
        //创建类部类对象
        Outer.Inner oi = new Outer().new Inner();

        oi.innerMethod();
        System.out.println(oi.inner);
    }
}
