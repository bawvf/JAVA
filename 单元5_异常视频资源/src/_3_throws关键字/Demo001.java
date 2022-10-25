package _3_throws关键字;

public class Demo001 {
    public static void main(String[] args) throws Exception {
        divide(6,0);
    }
    public static void divide(int num1,int num2) throws Exception {
        System.out.println(num1 / num2);
    }
}
