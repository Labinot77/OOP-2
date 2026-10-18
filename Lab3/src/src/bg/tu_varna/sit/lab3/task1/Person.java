package src.bg.tu_varna.sit.lab3.task1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesc() {
        return "Name: " + this.name + "Age: " + this.age;
    }
}
