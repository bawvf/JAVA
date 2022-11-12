package _12_同步代码块;

public class Demo001 {
    public static void main(String[] args) {
        //三个窗口同时售100张票
        Ticket1s t = new Ticket1s();

        new Thread(t,"窗口1").start();
        new Thread(t,"窗口2").start();
        new Thread(t,"窗口3").start();
    }
}
class Ticket1s implements Runnable{
    Object o = new Object();
    //1.定义共享资源
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
            if (ticket <= 0) {
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //2.打印当前线程名称，并将票数--
            System.out.println(Thread.currentThread().getName() + "卖出了第" + (ticket--) + "号票");

            }
        }
    }
}
