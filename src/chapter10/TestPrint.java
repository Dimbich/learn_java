package chapter10;

import java.util.Date;

public class TestPrint {
    public static void main(String[] args) {
//        String s1 = String.format("%,d", 10000000);
//        System.out.println(s1);
//        System.out.printf("Мне нужно исправить %,.2f ошибки.", 476578.09876);
//        System.out.printf("Мне нужно исправить %,.2f, ошибки.", 476578.09876);
//        System.out.printf("%7.1f ошибки.", 42.000);
//        System.out.println();
        int one = 1232324;
        double two = 1232121.3456;
        System.out.printf("Уровень %,10d из %,10.2f", one, two);
        System.out.println();
        Date today = new Date();
        System.out.printf("%tA %<tB %<tC, %<tc", today);
    }
}
