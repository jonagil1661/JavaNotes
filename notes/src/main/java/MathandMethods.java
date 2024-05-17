import java.lang.Math;

public class MathandMethods {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int max = Math.max(x, y); // Finds highest value between x & y.
        System.out.println(max); // 10

        int min = Math.min(x, y); // Finds lowest value between x & y.
        System.out.println(min); // 5

        double root = Math.sqrt(64); // Finds square root and is a double!
        System.out.println(root); // 8.0

        double absolute = Math.abs(-4.7); // Finds absolute value
        System.out.println(absolute); // 4.7

        double random1 = Math.random(); // Random number from 0.0 ≤ x < 1.0
        int random2 = (int) (Math.random() * 11); // Random number from 0 ≤ x < 10

        // method overload
        method1();
        method1("Hello");
        method1("hello", 1);
        int xx = method2();
        System.out.println(xx);
    }

    public static void method1() {
        System.out.println("Hello World!");
    }

    public static void method1(String s) {
        System.out.println(s);
    }

    public static void method1(String s, int i) {
        System.out.println(s + i);
    }

    public static int method2() {
        return 5; // must return int
    }
}
