package bg.tu_varna.sit.lab4.bonus;

public abstract class Customer {
    private String name;

    public Customer(String name) {
        this.name = getName();
    }

    public String getName() {
        return this.name;
    }
}
