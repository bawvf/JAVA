package _2_Runnable接口实现多线程;

public class Demo001 {
    public static void main(String[] args) {
        //4.创建对象
        MyRunnable mr = new MyRunnable();
        //5.调用start方法
//        mr.start();  Runnable没有start方法
        new Thread(mr).start();
        for (int i = 1; i <= 200; i++) {
            System.out.println("bbbbbbbbbbbb");
        }

    }
}

//1.找一个类实现Runnable接口
class MyRunnable implements Runnable {
    //2.重写run方法
    @Override
    public void run() {
        //3.将要执行的代码写在run方法中
        for (int i = 1; i <= 200; i++) {
            System.out.println("aaaaaaaaaaaaa");
        }
    }
}