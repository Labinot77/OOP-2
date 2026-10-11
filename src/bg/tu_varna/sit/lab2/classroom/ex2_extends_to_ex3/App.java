package bg.tu_varna.sit.lab2.classroom.ex2_extends_to_ex3;

import static bg.tu_varna.sit.lab2.classroom.ex2_extends_to_ex3.Utils.print;

public class App {
    public static void main(String[] args) {
        Room room = new Room("A101", 6.0, 4.0, 3.0);

        System.out.println(room.calculateArea());
        System.out.println(room.calculateVolume());
        System.out.println(room.getDescription());

        print("Thank you");
    }
}
