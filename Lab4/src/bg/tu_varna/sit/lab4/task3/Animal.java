package bg.tu_varna.sit.lab4.task3;

abstract class Animal implements Movement {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract String sound();

    @Override
    public String toString() {
        return getName() + ", "+ getAge();
    }
}
