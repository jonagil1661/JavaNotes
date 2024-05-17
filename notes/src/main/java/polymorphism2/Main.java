package polymorphism2;

public class Main {
    public static void main(String[] args) {
        // when calling the print() method with each object...
        Class1 a = new Class1();
        a.print(); // one
        Class1 b = new Class2();
        b.print(); // one
        Class1 c = new Class3();
        c.print(); // one

        Class2 d = new Class2();
        d.print(); // two
        Class2 e = new Class3();
        e.print(); // two

        Class3 f = new Class3();
        f.print(); // three

        System.out.println("\n\n\n");

        Class1 g = new Class1(); // A
        Class1 h = new Class2(); // AB
        Class1 i = new Class3(); // ABC

        Class2 j = new Class2(); // AB
        Class2 k = new Class3(); // ABC

        Class3 l = new Class3(); // ABC

        // Class3 m = new Class1(); // ERROR-child variable can't be parent object

    }
}
