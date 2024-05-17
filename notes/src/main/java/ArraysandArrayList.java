import java.util.Arrays;
import java.util.ArrayList; // import the ArrayList class

public class ArraysandArrayList {
    public static void main(String[] args) {
        /*
         * Arrays
         */

        String[] letters0 = { "a", "b", "c", "d", "e" };
        System.out.println(letters0[0]); // a
        System.out.println(letters0[4]); // e

        int[] nums = { 0, 1, 2, 3, 4 };
        for (int i = 0; i < nums.length; i++) { // 0 1 2 3 4
            System.out.println(nums[i]);
        }

        int[] nums1 = { 0, 1, 2, 3, 4 };
        nums1[2] = 34; // change value of certain index position
        for (int i = 0; i < nums1.length; i++) { // 0 1 34 3 4
            System.out.println(nums1[i]);
        }

        int[] nums2 = new int[5]; // instantiate a size. size cannot be changed
        nums2[1] = 3;
        for (int i = 0; i < nums2.length; i++) { // null 3 null null null
            System.out.println(nums2[i]);
        }

        /*
         * 2D Arrays
         */
        /*
         * 1 2 3
         * 4 5 6
         */
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(arr.length); // prints # of rows: 2
        System.out.println(arr[0].length); // prints # of columns in row: 3

        for (int i = 0; i < arr.length; i++) { // iterates through rows
            for (int j = 0; j < arr[0].length; j++) { // iterates through columns
                System.out.println(arr[i][j]);
                System.out.println();
            }

            /*
             * null null null
             * null null null
             * null null null
             */
            int[][] arr0 = new int[3][3]; // 3x3 matrix

            /*
             * ArrayList
             */

            /*
             * ArrayList size can be increased/decreased.
             */
            ArrayList<String> letters = new ArrayList<String>();
            letters.add("a");
            letters.add("b");
            letters.add("c");

            System.out.println(letters.get(0)); // a
            System.out.println(letters.get(1)); // b
            System.out.println(letters.get(2)); // c
            System.out.println(letters); // a b c
            System.out.println(letters.size()); // 3

            letters.set(0, "b");
            System.out.println(letters); // b b c

            letters.remove(2);
            System.out.println(letters); // b b

            letters.clear();
            System.out.println(letters); // null

            letters.add("a");
            letters.add("b");
            letters.add("c");

            for (String ij : letters) { // for-each loop
                System.out.println(ij);
            }
        }
    }
}
