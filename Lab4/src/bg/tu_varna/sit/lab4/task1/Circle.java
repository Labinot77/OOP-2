package bg.tu_varna.sit.lab4.task1;

public class Circle extends Shape {
    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public double calculateSurface() {
        return Math.PI * r * r;
    }
}
