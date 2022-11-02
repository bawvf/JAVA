package _7_File类的常用方法;

import java.io.File;

public class Demo001 {
    public static void main(String[] args) {

        File f1 = new File("E:\\学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\_7_File类的常用方法","111.txt");
        System.out.println(f1.exists());

        File f2 = new File(new File("E:\\学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\_7_File类的常用方法"),"111.txt");
        System.out.println(f2.exists());




        File file = new File("E:\\学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\_7_File类的常用方法\\111.txt");
        System.out.println(file.exists());

        File file2 = new File("abc.txt");
    }
}
