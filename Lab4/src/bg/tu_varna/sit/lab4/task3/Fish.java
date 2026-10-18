package bg.tu_varna.sit.lab4.task3;

public class Fish extends Animal implements Wild{
    public Fish(String name, int age) {
        super(name,age);
    }

    @Override
    String sound() {
        return "Fish";
    }

    @Override
    public String move() {
        return "Fish is moving";
    }

}
