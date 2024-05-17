package polymorphism1;

public class Airplane extends Vehicle {
    private int numWings;

    public Airplane() {
          super("airplane");
          numWings = 2;
    }

    public int getWings() {
        return numWings;
    }
}
