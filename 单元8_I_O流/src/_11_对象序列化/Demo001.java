package _11_对象序列化;

import java.io.*;

public class Demo001 {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
        Object object = ois.readObject();
        System.out.println(object);

        //创建对象输出流，用于将对象写到文件中去
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

        Person p = new Person("张三", 19);

        //使用对象输出流写出对象
        oos.writeObject(p);

        oos.close();
    }
}
