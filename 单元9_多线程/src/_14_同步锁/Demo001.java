package _14_同步锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo001 {
    public static void main(String[] args) {
        Tickets3 t = new Tickets3();
        new Thread(t,"窗口1---").start();
        new Thread(t,"窗口2---").start();
        new Thread(t,"窗口3---").start();
    }
}
class Tickets3 implements Runnable {
    int ticket = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();

            if (ticket <= 0) {
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出了第" + (ticket--) + "号票");
            lock.unlock();
        }
    }
}