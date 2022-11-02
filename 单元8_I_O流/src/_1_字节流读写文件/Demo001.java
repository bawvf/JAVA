package _1_字节流读写文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        //1.创建字节流输入对象
        FileInputStream file = new FileInputStream("E:\\学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\abc.txt");

        //2.读取文件中的数据
//        int i = file.read();
//        System.out.println(i);
        int i;
        while ((i = file.read()) != -1) {
            System.out.println((char) i);
        }

        //3.关闭流释放资源
        file.close();
    }
}
