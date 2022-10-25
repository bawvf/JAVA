package _6_Math类;

import java.util.Random;

public class tfg {
    public static void main(String[] args) {
        Random random1 = new Random(10);
        Random random2 = new Random(10);
        for (int i = 0; i < 5; i++) {
            System.out.print(random1.nextInt(5));
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(random2.nextInt(5));
        }
    }
}