package _4_字符流概述;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\学习及其工作\\" +
                "学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\" +
                "_4_字符流概述\\111.txt");

        byte[] bys = new byte[8];
        int i;
        while ((i = fis.read(bys)) != -1) {
            System.out.println(new String(bys,0,i));
        }

        fis.close();
    }
}
