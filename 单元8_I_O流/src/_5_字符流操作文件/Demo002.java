package _5_字符流操作文件;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo002 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\" +
                "学习及其工作\\学 习\\学校学习\\JAVA\\chuanzhiboke\\" +
                "单元8_I_O流\\src\\_5_字符流操作文件\\qwe.txt");
        //写出一个字符
        fw.write('a');

        //写出一个字符数组
        char[] cbs = {'1','2','3','4'};
        fw.write(cbs);

        //写出一个字符数组的一部分
        fw.write(cbs,0,2);

        //写出一个字符串
        fw.write("你好啊！");

        //写出字符串的一部分
        fw.write("你好啊",0,1);


        fw.close();
    }
}
