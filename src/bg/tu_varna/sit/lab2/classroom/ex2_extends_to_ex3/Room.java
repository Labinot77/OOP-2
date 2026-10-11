package bg.tu_varna.sit.lab2.classroom.ex2_extends_to_ex3;

public class Room {
    private String Number;
    private double Length;
    private double Width;
    private double Height;

    public Room(String number, double length, double width, double height) {
        Number = number;
        Length = length;
        Width = width;
        Height = height;
    }

    public String getNumber() {
        return Number;
    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }

    public double getHeight() {
        return Height;
    }

    public double calculateArea() {
        return (getLength() * getWidth());
    }

    public double calculateVolume() {
        return (getLength() * getWidth() * getHeight());
    }

    public String getDescription() {
        return "Room" + this.Number
                +  ", Area" + calculateArea() + ", m2"
                +  ", Volume" + calculateVolume() + ", m3";
    }
}
