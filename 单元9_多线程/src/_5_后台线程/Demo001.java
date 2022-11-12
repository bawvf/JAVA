package _5_后台线程;

public class Demo001 {
    public static void main(String[] args) {
        Thread t1 = new Thread();

        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println("我是后台线程(守护线程)");
                }
            }
        };
        t1.setDaemon(false); //将线程设置为后台线程

        Thread t2 = new Thread();

        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("我是前台线程(非守护线程)");
                }
            }
        };
        t2.start();
        t1.start();
    }
}
