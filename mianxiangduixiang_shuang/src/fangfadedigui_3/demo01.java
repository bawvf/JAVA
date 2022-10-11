package fangfadedigui_3;

public class demo01 {
    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println(sum);
    }
    public static int getSum(int num) {
        if (num == 1)
            return 1;
        return num + getSum(num - 1);
    }
}
