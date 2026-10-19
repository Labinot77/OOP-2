package bg.tu_varna.sit.lab4.task5;

public class App {
    public static void main(String[] args) {
                Addition addition = new Addition();

                System.out.println(addition.apply(2, 3));
                System.out.println(addition.apply(0, 0));
                System.out.println(addition.apply(-2, 3));
    }
}
