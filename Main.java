import java.awt.*;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world" + "\n");
//        System.out.println("Salma");
//        System.out.println("salma" + "\u2122");
//        final int x=30;
//    }
//}

class Arithmetic {
    public static void main(String[] args) {
        int x = 12;
        int y = 2 * x;
        System.out.println(y);
        int z = (y - x) % 5;
        System.out.println(z);
        final float pi = 3.1415F;
        float f = pi / 0.62F;
        System.out.println(f);


        String str = "ait";
        System.out.println(str.toUpperCase());


        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 0);
        p1 = p2;
        p1.x = -1;
        System.out.println(p2);


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hi"));
        System.out.println(s1.equals(s3));
    }
}

