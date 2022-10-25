package _5_Runtime类;

import java.io.IOException;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        //static RunTime getRuntime()
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt);

        //int availableProcessors()
        int num = rt.availableProcessors();
        System.out.println("处理器的个数是：" + num);

        //long freeMemory();
        long memory = rt.freeMemory();
        System.out.println(memory / 1024 / 1024 + "MB");

        //long maxMemory
        long maxMemory = rt.maxMemory();
        System.out.println(maxMemory / 1024 / 1024 + "MB");

        //Process exec(String dos)
        rt.exec("notepad.exe");
    }
}
