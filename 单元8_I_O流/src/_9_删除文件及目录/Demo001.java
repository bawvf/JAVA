package _9_删除文件及目录;

import javax.swing.*;
import java.io.File;

public class Demo001 {
    public static void main(String[] args) {
        File f = new File("E:");
        System.out.println(f.delete());
    }
    public static void del(File dir) {
//        File[] listFiles = dir.listFiles();
//        for (File file : listFiles) {
//            if (file.isFile()) {
//                //如果是文件，直接删除
//                file.delete();
//            } else if (file.isDirectory()) {
//                //递归调用该方法
//                if (file,listFiles() != null) {
//                    del(file);
//                }
//            }
//        }
        //删除空的文件夹
        dir.delete();
    }
}
