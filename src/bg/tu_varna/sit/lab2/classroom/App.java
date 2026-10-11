package bg.tu_varna.sit.lab2.classroom;

public class App {
    public static void main(String[] args) {

        Classroom room101 = new Classroom("101", 5, 2, ClassroomType.COMPUTER_LAB, false);
        System.out.println((room101.getRoomNumber()));
        room101.SetRoomNumber("Room202");
        System.out.println((room101.getRoomNumber()));

        System.out.println(room101.getCapacity());
        room101.setCapacity(5);
        System.out.println(room101.getCapacity());

        room101.setFloor(5);

        System.out.println(room101.getDescription());


    }
}
