package _2_Runnable接口实现多线程;

public class Demo002 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("线程A-->");
        a.start();

        ThreadB b = new ThreadB();
        new Thread(b,"线程B-->").start();
    }
}

class ThreadA extends Thread {
    public ThreadA(String name) {
        super(name);
    }
    public ThreadA() {
        super();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 200; i++)
            System.out.println(getName() + "aaaaaaaaaaaaaaaaaaaa");
    }
}
class ThreadB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 200; i++)
            System.out.println(Thread.currentThread().getName() + "bb");
    }
}