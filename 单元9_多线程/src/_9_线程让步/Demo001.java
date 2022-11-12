package _9_线程让步;

public class Demo001 {
    public static void main(String[] args) {
        Thread t = new Thread();

        new Thread(t,"线程A----").start();
        new Thread(t,"线程B----").start();
    }
}
class ThreadA implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
            if (i == 2) {
                System.out.println("线程让步");
                Thread.yield(); //线程运行到此，作出让步
            }
        }
    }
}