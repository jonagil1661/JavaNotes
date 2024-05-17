package polymorphism1;

public class Main {
    public static void main(String[] args) {
        Car b = new Car();
        Airplane c = new Airplane();

        System.out.println(b.get()); // car
        System.out.println(b.getTires()); // 4
        System.out.println(c.get()); // airplane
        System.out.println(c.getWings()); // 2

        Vehicle e = new Vehicle();
        Vehicle a = new Car();
        Vehicle d = new Motorcycle();
        System.out.println(e.get()); // unknown
        System.out.println(a.get()); // car
        System.out.println(d.get()); // motorcycle
    }
}