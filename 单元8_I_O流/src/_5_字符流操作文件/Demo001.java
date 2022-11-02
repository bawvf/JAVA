package _5_字符流操作文件;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\" +
                "学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流" +
                "\\src\\_5_字符流操作文件\\111.txt");

        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }

        fr.close();
    }
}
