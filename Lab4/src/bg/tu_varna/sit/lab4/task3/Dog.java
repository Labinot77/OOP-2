package bg.tu_varna.sit.lab4.task3;

public class Dog extends Animal implements Pet{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    String sound() {
        return "dog";
    }

    @Override
    public String move() {
        return "Moving";
    }
}
