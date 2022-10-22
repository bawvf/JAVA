package _3_类的封装;

public class Demo001 {
    public static void main(String[] args) {
        Person p = new Person();
//        为成员变量进行赋值
        p.setName("张三");
        p.setAge(19);
//        获取值
        String name = p.getName();
        int age = p.getAge();
        System.out.println(name + age);
    }
}
