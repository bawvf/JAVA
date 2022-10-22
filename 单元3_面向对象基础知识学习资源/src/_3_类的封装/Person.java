package _3_类的封装;

public class Person {
    //    成员变量：
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150)
            System.out.println("输入年龄不合法！");
        else
            this.age = age;


    }
    public int getAge() {
        return age;
    }

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
