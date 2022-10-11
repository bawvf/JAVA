package jiekou;

public interface Anmial {

    public static final int ID = 1;

    public abstract void breath();

    public default void getType(String type) {
        System.out.println("当前动物属于：" + type);
    }

    public static int getId() {
        return ID;
    }
}
