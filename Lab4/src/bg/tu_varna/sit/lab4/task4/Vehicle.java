package bg.tu_varna.sit.lab4.task4;

public interface Vehicle {
    void changeGear(int gear);
    double speedUp(double amount);
    double applyBrakes(double amount);


    default String getDescription() {
        return "This is a vehicle";
    }

    static String getCategory() {
        return "Transport";
    }


//    double applyBrakes(int amount); // When I have this declared twice, one of my classes needs to be abstact.
}
