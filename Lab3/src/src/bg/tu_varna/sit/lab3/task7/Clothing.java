package src.bg.tu_varna.sit.lab3.task7;

public class Clothing extends Product{
    private String size;

    public Clothing(String name, double price, CategoryTypes category, String size) {
        super(name, price, category);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", Size: " + size;
    }

    public String getSize() {
        return size;
    }
}
