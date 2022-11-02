package _5_字符流操作文件;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo003 {
    public static void main(String[] args) throws IOException {
        //字符流完成文件的拷贝
        FileReader fr = new FileReader("E:\\" +
                "学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流" +
                "\\src\\_5_字符流操作文件\\qwe.txt");
        FileWriter fw = new FileWriter("E:\\" +
                "学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\" +
                "单元8_I_O流\\src\\_5_字符流操作文件\\111.txt");

        char[] cbs = new char[1024];

        int i;
        while ((i = fr.read(cbs)) != -1) {
            fw.write(cbs,0,i);
        }

        fr.close();
        fw.close();
    }
}
