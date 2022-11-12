package _6_线程的生命周期及状态转换;

public class Demo001 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000); //计时等待
            System.out.println(i);
        }
    }
}
