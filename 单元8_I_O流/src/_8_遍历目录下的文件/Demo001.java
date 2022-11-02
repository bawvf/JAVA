package _8_遍历目录下的文件;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.function.Consumer;

public class Demo001 {
    public static void main(String[] args) {
//        File f = new File("E:");
//        String[] list = f.list();
//        System.out.println(list);
//        if (f.isDirectory()) {
//            String[] sArr = f.list();
//            Arrays.stream(sArr).forEach((s -> {System.out.println(s);}));
//
//        }

//        //筛选遍历扩展名为txt的文件
//        File f = new File("E:");
//        if (f.isDirectory()) {
//            f.list(new FilenameFilter() {
//                @Override
//                public boolean accept(File dir, String name) {
//                    return name.endsWith(".txt");
//                }
//            });
//        }

        //递归遍历目录文件：获取一个文件夹下所有的文件名称，包括子文件夹
        printFile(new File("E:"));
    }

    public static void printFile(File dir) {
        //1.获取传入文件夹下的所有文件和文件夹对象
        File[] files = dir.listFiles();
        //2.遍历数组
        for (File file : files) {
            //3.如果是文件就打印名称
            if (file.isFile()) {
                System.out.println(file.getName());
                //4.如果是文件夹，就递归调用该方法
            } else if (file.isDirectory()) {
                if (file.listFiles() != null)
                printFile(file);

            }
        }
    }
}
