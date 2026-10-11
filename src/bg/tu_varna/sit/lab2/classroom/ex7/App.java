package bg.tu_varna.sit.lab2.classroom.ex7;

public class App {
    public static void main(String args[]) {
                Order order1 = new Order(1, "Laptop", 1500, OrderStatusType.DELIVERED);
                Order order2 = new Order(2, "Phone", 800, OrderStatusType.CANCELLED);
                Order order3 = new Order(3, "Mouse", 25, OrderStatusType.SHIPPED);
                Order order4 = new Order(4, "Keyboard", 60, OrderStatusType.NEW);

                Order[] orders = {order1, order2, order3, order4};

                for (Order order : orders) {
                    System.out.println(order.getDescription());
                    System.out.println(order.getStatus().getMessage());
                    System.out.println();
                }

                order3.changeStatus(OrderStatusType.DELIVERED);
                System.out.println(order3.getDescription());
    }
}
