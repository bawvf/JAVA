package _12_静态内部类;

public class Outer {
//    外部类的成员变量
    static int outer = 10;

//    静态成员内部类
    static class Inner {
//        内部类的成员变量
        int inner = 20;
//        内部类的成员方法
    public void innerMethod() {
        System.out.println("内部类的成员变量：" + inner);
        System.out.println("外部类的成员变量：" + outer);


    }
}
}
