package _1_Thread类实现多线程;

public class Demo001 {
    public static void main(String[] args) {
        //4.创建线程对象
        MyThread mt = new MyThread();
        //5.调用start方法开启线珵
        mt.start();  //当调用了start方法，系统自动的调用run方法

        //调用run方法，数据没有交替执行效果，调用start方法，出现了交替执行的效果

        for (int i = 1; i <= 200; i++) {
            System.out.println("bbbbbbbbbbbb");
        }
    }
}

//1.继承Thread类
class MyThread extends Thread {
    //重写run方法
    @Override
    public void run() {
        //3.在run方法中，编写线程执行的任务
        for (int i = 1; i <= 200; i++) {
            System.out.println("aaaaaaaaaaaaaaa");
        }
    }
}
