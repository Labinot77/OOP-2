package src.bg.tu_varna.sit.lab3.task7;

public class Product {
    protected String name;
    private double price;
    private CategoryTypes category;

    public Product(String name, double price, CategoryTypes category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Product: " + name +
                ", Price: " + price +
                ", Category: " + category;
    }
}
