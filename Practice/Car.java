package Practice;

public class Car {
    public static void main(String[] args) {
        Car c = new Sedan();
        switch (c) {
            case Mini m -> System.out.println("This is a Mini car: " + m);
            case Cab cb -> System.out.println("This is a Cab car: " + cb);
            case Sedan s -> System.out.println("This is a Sedan car: " + s);
            default -> System.out.println("Unknown car type");
        }
    }
}
