package _8_线程休眠;

public class Demo001 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
