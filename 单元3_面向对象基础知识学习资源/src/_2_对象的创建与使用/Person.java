package _2_对象的创建与使用;

public class Person {
    //    成员变量：
    String name;
    int age;

    //    成员方法：
//    吃饭：
    public void eat(String food) {
        String naem = "李四"; //局部变量
        System.out.println(name +  "正在吃：" + food);
    }
    //    睡觉：
    public void sleep() {
        System.out.println(name + "正在睡觉！");
    }
}
