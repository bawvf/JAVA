package _1_类的定义;

public class Person {
//    成员变量：
    String name;
    int age;

//    成员方法：
//    吃饭：
    public void eat(String food) {
        System.out.println(name +  "正在吃：" + food);
    }
    //    睡觉：
    public void sleep() {
        System.out.println(name + "正在睡觉！");
    }
}
