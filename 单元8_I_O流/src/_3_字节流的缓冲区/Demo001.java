package _3_字节流的缓冲区;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo001 {
    public static void main(String[] args) throws IOException {

        //1.创建输入输出流，创建关联数据
        FileInputStream file = new FileInputStream("E:\\学习及其工作" +
                "\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\" +
                "_2_文件的拷贝\\abc.txt");
        FileOutputStream fole = new FileOutputStream("E:\\学习及其工作" +
                "\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\" +
                "_2_文件的拷贝\\bcd.txt");

        //创建字节缓冲区
        byte[] bys = new byte[1024];

        //2.在读的过程中，将数据写入到目的堤当中
        int i;
        while ((i = file.read()) != -1) {
            fole.write(i);
        }

        //3.
        file.close();
        fole.close();
    }
}
