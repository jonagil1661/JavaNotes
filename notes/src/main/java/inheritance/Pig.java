package inheritance;

//subclass-inherits everything from superclass & has access
public class Pig extends Animals {
    private String sound = "oink oink";

    public static void main(String[] args) {
        Pig obj = new Pig();

        obj.burp(); // prints 'BUUURRRPP'
        System.out.println(obj.sound); // 'oink oink'
        System.out.println(obj.animal); // 'animal'
    }
}