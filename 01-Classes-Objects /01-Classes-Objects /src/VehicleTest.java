// Demonstrates Classes and Objects
class Vehicle {
    String name;
    int speed;

    void show() {
        System.out.println(name + " speed: " + speed);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.name = "Car";
        v.speed = 120;
        v.show();
    }
}
