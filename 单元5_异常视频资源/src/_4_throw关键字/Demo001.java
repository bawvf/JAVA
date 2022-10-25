package _4_throw关键字;

public class Demo001 {
    public static void main(String[] args) throws Exception {
        printAge(-23);
    }
    public static void printAge(int age) throws Exception {
        if (age < 0 || age > 150) {
            throw new Exception("年龄不在正确的范围");
        } else {
            System.out.println(age);
        }
    }
}
