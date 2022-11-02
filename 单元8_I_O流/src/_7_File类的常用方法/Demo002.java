package _7_File类的常用方法;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Demo002 {
    public static void main(String[] args) throws IOException {
//        //delete方法：删除文件或文件夹
//        File f1 = new File("E:\\1122.txt");
//        System.out.println(f1.delete());
//
//        //createNewFile()方法：创建一个文件， 返回是否创建成功
//        System.out.println(f1.createNewFile());

//        File f1 = new File("E:\\a.txt");
//        //getName()：获取文件、文件夹名称
//        System.out.println(f1.getName());
//        //getPath()：获取对象构造方法中封装的路径
//        System.out.println(f1.getPath());
//        //getAbsolutePath()：获取绝对路径
//        System.out.println(f1.getAbsolutePath());
//        //getParent()：获取父亲路径
//        System.out.println(f1.getParent());

//        //boolen canRean()
//        File f = new File("E:\\1122.txt");
//        System.out.println(f.canRead());
//
//        //boolean canWrite()
//        System.out.println(f.canWrite());

//        File f = new File("E:\\1122.txt");
//        //boolean isFile() 判断当前文件是否是文件
//        System.out.println(f.isFile());
//        //boolan isDirectory() 判断当前文件是否是文件夹
//        System.out.println(f.isDirectory());

//        File f = new File("E:\\1122.txt");
//        //long lastModified()：获取最后修改时间的毫秒值
//        long time = f.lastModified();
//        System.out.println(new Date(time));
//
//        //long length()：返回文件大小
//        long length = f.length();
//        System.out.println(length);

        File f = new File("E:");

        //String[] list()：返回当前文件夹下所有的文件和文件夹名称
        String[] sArr = f.list();
        for (String s : sArr) {
            System.out.println(s);
        }

        //String[] list(FilenameFilter filter)：返回当前文件夹下所有的文件和文件夹名称,带有筛选效果

        //File[] listFiles()：返回当前文件夹下所有的文件和文件夹对象
    }
}
