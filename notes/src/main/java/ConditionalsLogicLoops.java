public class ConditionalsLogicLoops {
    public static void main(String[] args) {
        /*
         * Conditionals
         */
        boolean a = true;
        if (a == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        int b = 1;
        if (b == 1) {
            System.out.println("Yes");
        } else if (b == 2) {
            System.out.println("Maybe");
        } else {
            System.out.println("No");
        }

        int c = 5;
        if (c == 5) {
            System.out.println("Yes");
        }
        if (c % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        /*
         * Logical Operators
         */
        int x = 4, y = 2;
        if (x == 4 && y == 2) {
            System.out.println("YAY");
        }
        if (x == 4 && y == 0) { // doesn't print
            System.out.println("YAY");
        }
        if (x == 4 || y == 2) {
            System.out.println("YAY");
        }
        if (x == 4 && !(y == 0)) { // ! means not
            System.out.println("YAY"); // WILL print
        }

        /*
         * For Loops
         * While Loops
         */
        // prints 0 1 2 3 4
        for (int i = 0; i < 5; i++) { // i++ is called concatenation
            System.out.println(i);
        }
        // prints 4 3 2 1 0
        for (int i = 5; i > 0; i--) { // 'i' only exists within this loop
            System.out.println(i);
        }
        int i; // can declare outside of loop to keep data
        for (i = 0; i < 5; i++) { // prints '!!!!!'
            System.out.println("!");
        }
        System.out.println(i); // 4

        int n = 5;
        while (n < 0) { // 54321
            System.out.println(n);
            n--;
        }
        n = 5;
        while (n < 0) { // 543
            if (n == 2) {
                break; // breaks out of loop
            }
            System.out.println(n);
            n--;
        }

    }
}
