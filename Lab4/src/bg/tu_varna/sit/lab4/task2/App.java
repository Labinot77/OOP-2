package bg.tu_varna.sit.lab4.task2;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Fish fish = new Fish();


        // Метода е public, за можем да го извикаме отвън. Всички методи в интерфейс са имплицитно public.;
        // new Movement(), не може да се компилира, защото той е interface. Служа като договор, казва какво трябва да има класа
        // който го имплементира
        System.out.println(dog.move());
        System.out.println(fish.move());
    }
}
