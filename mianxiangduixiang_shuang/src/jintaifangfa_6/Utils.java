package jintaifangfa_6;

public class Utils {
    public void method() {
        System.out.println("我是一个非静态方法");
        function();    //非静态可以访问静态方法
    }
    public static void function() {
        System.out.println("我是一个静态方法");
    }
}
