package bg.tu_varna.sit.lab4.task4;

public class App {
    public static void main(String[] args) {
    Car car = new Car(200);
    Bike bicycle = new Bike(60);

        bicycle.changeGear(3);
        System.out.println("Bicycle speed: " + bicycle.speedUp(140));
        System.out.println("Bicycle after braking: " + bicycle.applyBrakes(1));

        System.out.println();

        car.changeGear(2);
        System.out.println("Car speed: " + car.speedUp(10));
        System.out.println("Car after braking: " + car.applyBrakes(5));

        System.out.println();

        System.out.println(bicycle.getDescription());
        System.out.println(Vehicle.getCategory());
    }
}
