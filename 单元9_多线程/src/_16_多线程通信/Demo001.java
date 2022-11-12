package _16_多线程通信;

public class Demo001 {
    public static void main(String[] args) {
        Printer p = new Printer();

        new Thread() {
            public void run() {
                while (true) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                while (true) {
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
class Printer {

    int flag = 1;

    public void print1() throws InterruptedException {
        synchronized (this) {

            if (flag != 2) {
                this.wait();
            }

            System.out.print("1");
            System.out.print("2");
            System.out.print("3");
            System.out.print("4");
            System.out.println();

            flag = 2;
            this.notify();
        }
    }
    public void print2() throws InterruptedException {
        synchronized (this) {

            if (flag != 1) {
                this.wait();
            }

            System.out.print("a");
            System.out.print("b");
            System.out.print("c");
            System.out.print("d");
            System.out.println();

            flag = 1;
            this.notify();
        }

    }
}
