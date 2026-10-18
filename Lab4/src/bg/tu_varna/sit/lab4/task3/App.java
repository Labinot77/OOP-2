package bg.tu_varna.sit.lab4.task3;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3);
        Bird bird = new Bird("Tweety", 1);
        Fish fish = new Fish("Nemo", 2);

        System.out.println(dog.toString());
        System.out.println("Movement: " + dog.move());
        System.out.println("Sound: " + dog.sound());
        System.out.println("Type: " + dog.type());


        System.out.println();

        System.out.println(bird.toString());
        System.out.println("Movement: " + bird.move());
        System.out.println("Sound: " + bird.sound());
        System.out.println("Type: " + bird.type());

        System.out.println();

        System.out.println(fish.toString());
        System.out.println("Movement: " + fish.move());
        System.out.println("Sound: " + fish.sound());
        System.out.println("Type: " + fish.type());
    }
}
