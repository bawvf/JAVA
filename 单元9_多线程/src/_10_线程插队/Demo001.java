package _10_线程插队;

public class Demo001 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i == 2) {
                        try {
                            t1.join();   //t1执行完才会到t2
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("bb");
                }
            }
        };
        t2.start();
        t1.start();
    }
}
