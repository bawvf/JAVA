package _3_Callable接口实现多线程;

import javax.sql.rowset.CachedRowSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Demo001 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //callable:即能开启线程，又能够得到线程的返回值结果

        //2.创建FutureTask方法，并将callable的实现类对象传入构造方法
        FutureTask<Integer> ft1 = new FutureTask<>(new MyCallable());
        //3.创建Thread类对象，并将FutureTask传入构造方法中,并调用start方法开启线程
        new Thread(ft1,"线程A").start();

        FutureTask<Integer> ft2 = new FutureTask<>(new MyCallable());
        new Thread(ft2,"线程B").start();

        //调用get方法获取call方法的返回值
        System.out.println(ft1.get());
        System.out.println(ft1.get());
    }
}
//1.实现callable接口，重写call方法
class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " 当前的数值为：" + i);
            sum += i;
        }
        return sum;
    }
}