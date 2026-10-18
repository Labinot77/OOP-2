package src.bg.tu_varna.sit.lab3.task7;

public class Food extends Product {
    private String expirationDate;

    public Food(String name, double price,CategoryTypes category,String expirationDate) {
        super(name, price, category);
        this.expirationDate = expirationDate;

    }

    public String getDesc() {
        return getDescription() +
                "Expiration date" + this.expirationDate;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public double addTax() {
        return (double) Math.round(super.getPrice() + super.getPrice() * 0.10 * 100) / 100;
    }
}
