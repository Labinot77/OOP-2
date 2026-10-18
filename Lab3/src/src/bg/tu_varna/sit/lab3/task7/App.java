package src.bg.tu_varna.sit.lab3.task7;

public class App {
    public static void main(String[] args) {
                Food food = new Food("Milk", 3.50, CategoryTypes.Meat ,"20.10.2026");
                Clothing clothing = new Clothing("T-Shirt", 25.00, CategoryTypes.Diary , "M");

                System.out.println(food.getDescription());
                System.out.println("Expiration date: " + food.getExpirationDate());
                System.out.println("Tax: " + food.addTax());

                System.out.println();

                System.out.println(clothing.getDescription());
                System.out.println("Size: " + clothing.getSize());
    }
}
