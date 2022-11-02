package _10_RandomAccesseFile类;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("E:\\学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\单元8_I_O流\\src\\_10_RandomAccesseFile类\\config.txt","rw");

        int num = Integer.parseInt(raf.readLine()) -1;

        if (num > 0) {
            //说明还有机会
            System.out.println("您还有" + num + "次");
            raf.seek(0);
            raf.write((num + "").getBytes());
        } else {
            System.out.println("使用完");
        }

        raf.close();
    }
}
