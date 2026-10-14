package bg.tu_varna.sit.lab2.classroom;

public class Classroom {
    private static final int MIN_CAPACITY = 10;
    private static int counter = 0;

    private String roomNumber;
    private int capacity;
    private int floor;
    private ClassroomType type;
    private boolean hasProjector;

    public Classroom() {
        this("unknown", 10, 1, ClassroomType.SEMINAR, false);
    }
    public Classroom(String roomNumber, int capacity, int floor, ClassroomType type, boolean hasProjector) {
        this.roomNumber = roomNumber;
        this.capacity = validation(capacity);
        this.floor = floor;
        this.type = type;
        this.hasProjector = hasProjector;
        counter++;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void SetRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    private static int validation(int capacity) {
        if (capacity < MIN_CAPACITY) return MIN_CAPACITY;
        return capacity;

//        return Math.Max(capacity, MIN_CAPACITY);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ClassroomType getType() {
        return type;
    }

    public void setType(ClassroomType type) {
        this.type = type;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public void setCapacity(int capacity) {
        this.capacity = validation(capacity);
    }

    public String getDescription() {
        return "Зала: " + roomNumber
                + ", капацитет " + capacity
                + ", етаж: " + floor
                + ", тип: " + type
                + ", проектор" + (hasProjector ? "ДА" : "НЕ");
    }
}

