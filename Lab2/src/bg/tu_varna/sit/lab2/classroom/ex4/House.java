package bg.tu_varna.sit.lab2.classroom.ex4;

public class House {
    private String Address;
    private int Floor;
    private double Area;
    private boolean HasGarage;

    public House () {
        this.Address = "Valentina Tereshkova 4";
        this.Floor = 1;
        this.Area = 100.23;
        this.HasGarage = true;
    }

    public House(String address, int floor, double area, boolean hasGarage) {
        this.Address = address;
        this.Floor = floor;
        this.Area = area;
        this.HasGarage = hasGarage;
    }

    public String getAddress() {
        return Address;
    }

    public int getFloor() {
        return Floor;
    }

    public double getArea() {
        return Area;
    }

    public boolean isHasGarage() {
        return HasGarage;
    }

    public String getDescription() {
        return Address + ',' + Floor + "," + Area + "," + HasGarage;
    }

    public boolean isLargerThan(House other) {
        return this.Area > other.Area;
    }

    public boolean hasMoreFloorsThan(House other) {
        return  this.Floor > other.Floor;
    }
}
