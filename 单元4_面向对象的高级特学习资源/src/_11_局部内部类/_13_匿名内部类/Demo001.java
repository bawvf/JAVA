package _11_局部内部类._13_匿名内部类;

public class Demo001 {
    public static void main(String[] args) {
//        整体等效于：是Animal父类的子类对象
//        new Animal() {
//            @Override
//            public void eat() {
//                System.out.println("狗吃肉");
//            }
//        }.eat();

        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }
        };
        a.eat();
    }
}
