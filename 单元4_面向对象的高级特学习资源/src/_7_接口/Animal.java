package _7_接口;

public interface Animal {
//    提供一个常量
    public static final int ID = 1;

//    抽象方法：
    public abstract void breath();

//    默认的方法：
    public default void getType(String type) {
        System.out.println("当前动物是属于：" + type);
    }

//    静态方法：
    public static int getId() {
        return ID;
    }
}
