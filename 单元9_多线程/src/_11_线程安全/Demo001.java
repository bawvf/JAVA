package _11_线程安全;

public class Demo001 {
    public static void main(String[] args) {
        //三个窗口同时售100张票
        Tickets t = new Tickets();

        new Thread(t,"窗口1").start();
        new Thread(t,"窗口2").start();
        new Thread(t,"窗口3").start();
    }
}
class Tickets implements Runnable{
    //1.定义共享资源
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                break;
            }
            //2.打印当前线程名称，并将票数--
            System.out.println(Thread.currentThread().getName() + "卖出了第" + (ticket--) + "号票");
        }
    }
}
