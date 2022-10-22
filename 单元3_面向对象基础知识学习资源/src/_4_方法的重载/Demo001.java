package _4_方法的重载;

public class Demo001 {
    public static void main(String[] args) {
        int sum = getSum(10,20);
        System.out.println(sum);
        int sum1 = getSum(10,20,30);
        System.out.println(sum1);
    }

//    定义求两个整数合的方法
    public static int getSum(int num1,int num2) {
        int sum = num1 + num2;
        return sum;
    }
//    定义求三个整数合的方法
public static int getSum(int num1,int num2,int num3) {
    int sum = num1 + num2 + num3;
    return sum;
}
}
