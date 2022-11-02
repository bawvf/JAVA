package _3_字节缓冲流;

import java.io.*;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        //1.创建字节缓冲，输入输出流
        BufferedInputStream bis = new BufferedInputStream(new
                FileInputStream("E:\\学习及其工作\\学 习\\" +
                "学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\_3_字节流的缓冲区\\abc.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new
                FileOutputStream("E:\\学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\" +
                "单元8_I_O流\\src\\_3_字节流的缓冲区\\111.txt"));

        //2.读写操作
        int i;
        while ((i = bis.read()) != -1) {
            bos.write(i);
        }

        //3.关闭流释放资源
        bis.close();
        bos.close();
    }
}
