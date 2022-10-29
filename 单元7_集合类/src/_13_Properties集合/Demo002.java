package _13_Properties集合;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo002 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        //void load(InputStream inStream) 从流中读取文件内容
        prop.load(new FileInputStream("config.properties"));

        String username = prop.getProperty("usernaem");
        String passworld = prop.getProperty("pasworld");
        System.out.println(username);
        System.out.println(passworld);
    }
}
