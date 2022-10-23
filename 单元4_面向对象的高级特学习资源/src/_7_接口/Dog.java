package _7_接口;

import java.net.SocketOption;

public class Dog implements Animal,LandAnimal {

    @Override
    public void breath() {
        System.out.println("狗在呼吸");
    }

    @Override
    public void run() {
        System.out.println("狗在奔跑");
    }
}
