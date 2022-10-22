package _2_对象的创建与使用;

public class Demo001 {
    public static void main(String[] args) {
//        创建Person对象
        Person p = new Person();

//        使用成员变量：
        System.out.println(p.name);
        System.out.println(p.age);
//        为成员变量赋值：
        p.name = "张三";
        p.age = 19;
//        再次使用成员变量：
        System.out.println(p.name);
        System.out.println(p.age);

//        使用成员方法：
        p.eat("米饭");
        p.sleep();

    }
}
