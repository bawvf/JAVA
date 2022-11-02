package _1_字节流读写文件;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Demo002 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输出流
        FileOutputStream file = new FileOutputStream("E:\\学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\111.txt",true);

        //2.写出数据
        file.write(97);

        byte[] bytes = "你好啊".getBytes();
        System.out.println(Arrays.toString(bytes));
        file.write(bytes);

        //3.关闭流释放资源
        file.close();
    }
}
