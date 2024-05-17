package polymorphism1;

public class Car extends Vehicle {
    private int numTires;

    public Car() {
        super("car");
        numTires = 4;
    }

    public int getTires() {
        return numTires;
    }
}