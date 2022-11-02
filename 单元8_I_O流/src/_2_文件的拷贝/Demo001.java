package _2_文件的拷贝;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        //1.创建输入流和输出流对象
        FileInputStream file = new FileInputStream("E:\\学习及其工作" +
                "\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\_2_" +
                "文件的拷贝\\111.txt");
        FileOutputStream fole = new FileOutputStream("E:\\学习及其工作\\学 习" +
                "\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\_2_文件的拷贝\\" +
                "abc.txt");

        //2.在读取的过程中，将数据写出到目标文件当中
        int i;
        while ((i = file.read()) != -1) {
            fole.write(i);
        }

        //3.关闭流释放资源
        file.close();
        fole.close();
    }
}
