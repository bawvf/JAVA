package leidefenvhiang_1;

public class Person {
    private String name;
    private int age;

    //封装
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 200) {
            System.out.println("输入的值不合法！");
        } else
            this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void eat(String food) {
        String name = "李四";
        System.out.println(name + "正在吃" + food);
    }

    public void sleep() {
        System.out.println("在睡觉！");
    }
}
