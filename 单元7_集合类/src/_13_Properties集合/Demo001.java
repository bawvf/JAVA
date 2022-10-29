package _13_Properties集合;

import java.util.Properties;

public class Demo001 {
    public static void main(String[] args) {
        //创建Properties集合对象
        Properties prop = new Properties();

        //向集合中添加数据
        prop.setProperty("username","admin");
        prop.setProperty("passworld","123456");

        //获取集合中的数据
        String username = prop.getProperty("username");
        String password = prop.getProperty("passworld");

        System.out.println(username + "====" + password);
    }
}
