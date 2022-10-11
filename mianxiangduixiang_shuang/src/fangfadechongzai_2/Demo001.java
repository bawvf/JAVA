package fangfadechongzai_2;

public class Demo001 {
    public static void main(String[] args) {
        int sum = getSum(10,20);
        System.out.println(sum);
    }

    public static int getSum(int num1,int num2,int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static int getSum(int num1,int num2,int num3,int num4) {
        int sum = num1 + num2 + num3 + num4;
        return sum;
    }

    public static int getSum(int num1,int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
