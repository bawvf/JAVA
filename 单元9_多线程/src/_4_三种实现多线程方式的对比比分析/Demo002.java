package _4_三种实现多线程方式的对比比分析;

public class Demo002 {
    public static void main(String[] args) {
        /*多个线程处理一个【共享资源】的情况

        需求：模拟火车售票，2个售票窗口共享10张票

        A:实现Runnable接口形式
        B:继承Thread形式
        */

        new MyTicketsThread("窗口1").start();
        new MyTicketsThread("窗口2").start();
    }
}
class MyTicketsThread extends Thread {

    public MyTicketsThread(String name) {
        super(name);
    }


    int ticket = 10;

    @Override
    public void run() {
        while (true) {
            if (ticket <=0) {
                break;
            }
            System.out.println(getName() + "卖出了第：" + (ticket--) + "号票");
        }
    }
}
