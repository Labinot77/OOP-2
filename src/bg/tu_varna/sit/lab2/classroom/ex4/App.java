package bg.tu_varna.sit.lab2.classroom.ex4;

public class App {
    public static void main(String args[]) {
        House house1 = new House();
        House house2 = new House("Patriarh Maksim 24", 3, 64, true);

        System.out.println("House2, " + house1.getDescription() + ", House2" + house2.getDescription());
        System.out.println("House 1 is larger: " + house1.isLargerThan(house2));
        System.out.println("House 1 has more floors: " + house1.hasMoreFloorsThan(house2));
    }
}
