package introduction;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("This doesn't skip a line");

        /**
         * Variables must start lowercase
         */
        int a = 3;
        System.out.println("a = " + a);

        double b = 3.5;
        System.out.println("b = " + b);

        String c;
        c = "Hello World!";
        System.out.println("c = " + c);

        boolean d;
        d = true;
        System.out.println("d = " + d);

        /**
         * Operators
         */
        int a1, b1;
        a1 = 4;
        b1 = 5;
        int a2 = 2, b2 = 5;
        System.out.println(a2 + b2); // -, *, /, %

        System.out.println(a + a);
        System.out.println(a + a + " vs " + a + a); // 6 vs 33

        a = 5;
        a += 7;
        System.out.println(a); // 12
        a -= 3;
        System.out.println(a); // 9
        a *= 2;
        System.out.println(a); // 18
        a /= 7;
        System.out.println(a); // 2

        String s = ":)";
        System.out.println(s + s); // :):)

        /*
        * What if we want to find even/odd?
        * % finds the remainder.
        */ 
        a = 5;
        System.out.println(a % 2); // if 0, then even & if 1, then odd.
    }
}
