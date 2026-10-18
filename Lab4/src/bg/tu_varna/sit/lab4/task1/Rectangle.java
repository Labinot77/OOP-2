package bg.tu_varna.sit.lab4.task1;

public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle(String name, double w, double h) {
        super(name);
        this.w = w;
        this.h = h;
    }

    public double calculateSurface() {
        return w * h;
    };
}
