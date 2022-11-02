package _12_工具类;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        //1.获取path对象
        Path path = Paths.get("E:\\abc\\abc.txt");

        //createDirectories: 创建多级文件夹
        Files.createDirectories(path);

        //createFile:创建文件
        Path paths2 = Paths.get("E:\\abc\\abc.txt\\abc.txt");
        Files.createFile(paths2);

        //write(Path Path,Iterable <? extends CharSequence> lines, OpenOption...options)
        //将文本行写入文件，并传入指定的写入模式
        ArrayList<String> list = new ArrayList<>();
        list.add("这是一行文本");
        list.add("这是二行文本");
        list.add("这是三行文本");

        Files.write(paths2,list, StandardOpenOption.APPEND);

        //static List<String> readAllLines(Path path): 从文件中读取所有行
        List<String> list2 = Files.readAllLines(paths2);
        System.out.println(list2);

        //static long size(Path path):返回文件的大小，以字节为单位
        long size = Files.size(paths2);
        System.out.println(size);

    }
}
