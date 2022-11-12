package _7_线程的优先级;

public class Demo001 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("t1线程正在执行，我是优先级高的");
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("t2线程正在执行");
                }
            }
        };

        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
