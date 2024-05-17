import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scanner object is created
        
        System.out.println("Enter your name: ");
        String name = scan.nextLine(); //reads user input
        
        System.out.println("Enter your age: ");
        int age = scan.nextInt(); // this one reads int and registers it as is
        scan.close(); // closes the scanner
        
        System.out.println("Your name is " + name + " and you are " + age + " years old");
    }
}
