package _13_同步方法;

public class Demo001 {
    public static void main(String[] args) {
        MyTickets m = new MyTickets();
        new Thread(m,"窗口1--").start();
        new Thread(m,"窗口2--").start();
        new Thread(m,"窗口3--").start();
    }
}
class MyTickets implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            method();
        }
    }
    public synchronized void method() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出了第" + (ticket--) + "号票");
        }

    }
}
