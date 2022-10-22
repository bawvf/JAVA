package _5_方法的递归;

public class Demo001 {
    public static void main(String[] args) {
//        需求：5-1之间数字之和
        int num = getSum(5);
        System.out.println(num);
    }
    public static int getSum(int num) {
        if (num == 1)
            return 1;
        return num + getSum(num - 1);
    }
}
