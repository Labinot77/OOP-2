package src.bg.tu_varna.sit.lab3.task2;

public class Animal {
    private String name;
    private int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDesc() {
        return "daodjsjda";
    }

    public double calculateBaseDailyFood() {
        return weight * 4.5;
    }

}
