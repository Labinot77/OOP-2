package bg.tu_varna.sit.lab4.task1;

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = getName();
    }

    public String getName() {
        return name;
    }

    abstract double calculateSurface();

    @Override
    public String toString() {
        return getName() + "Surface" + calculateSurface();
    }
}
