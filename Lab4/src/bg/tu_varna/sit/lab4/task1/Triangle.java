package bg.tu_varna.sit.lab4.task1;

public class Triangle extends Shape {
    private double base;
    private double h;

    public Triangle(String name, double base, double h) {
        super(name);
        this.base = base;
        this.h = h;
    }

    @Override
    public double calculateSurface() {
        return base * h / 2.0;
    }
}
