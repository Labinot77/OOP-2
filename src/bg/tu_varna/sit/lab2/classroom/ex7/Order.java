package bg.tu_varna.sit.lab2.classroom.ex7;

public class Order {
    private int id;
    private String product;
    private double price;
    private OrderStatusType status;

    public Order(int id, String product, double price, OrderStatusType status) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public String getDescription() {
        return "Order #" + id + ", Product: " + product
                + ", Price: " + price;
    }

    public void changeStatus(OrderStatusType status) {
        this.status = status;
    }
}