package _6_转换流;

import java.io.*;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "E:\\学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\" +
                        "单元8_I_O流\\src\\_6_转换流\\111.txt"),"UTF-8");
        int i;
        while ((i = isr.read()) != -1) {
            System.out.println((char) i);
        }

        isr.close();

    }
}
