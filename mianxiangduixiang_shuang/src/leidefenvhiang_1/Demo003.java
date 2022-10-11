package leidefenvhiang_1;

public class Demo003 {
    public static void main(String[] args) {
        Person p = new Person();
        //为成员变量赋值
        p.setName("张三");
        p.setAge(-23);

        //获取值
        String name = p.getName();
        int age = p.getAge();
        System.out.println("姓名是：" + name + "年龄是：" + age);
    }
}








//        p.name = "张三";
//        p.age = 23;
//
//        System.out.println("姓名是：" + p.name + "年龄是：" + p.age);
//        p.sleep();
//        p.eat("qwe");

