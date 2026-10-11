package bg.tu_varna.sit.lab2.classroom.ex7;

public enum OrderStatusType {
    NEW("The order is still being processed."),
    SHIPPED("The order is still being processed."),
    DELIVERED("The order has been delivered."),
    CANCELLED("The order has been cancelled.");

    private final String message;

    OrderStatusType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
