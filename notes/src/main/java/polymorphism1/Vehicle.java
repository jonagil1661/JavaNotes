package polymorphism1;

//parent class 'Vehicle'
public class Vehicle {
    private String vehicleType;

    public Vehicle() {
        vehicleType = "unknown";
    }

    public Vehicle(String s) {
        vehicleType = s;
    }

    public String get() {
        return vehicleType;
    }
}