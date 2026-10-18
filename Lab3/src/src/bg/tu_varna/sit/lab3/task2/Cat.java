package src.bg.tu_varna.sit.lab3.task2;

public class Cat extends Animal {
    private String furColor;
    private boolean indoor;

    public Cat(String name, int age, double weight, String furColor, boolean indoor) {
        super(name,age,weight);
        this.furColor = furColor;
        this.indoor = indoor;
    }

    public String getCatDescription() {
        return super.getDesc();
    }

    private double isIndoorCalcFood() {
        return this.indoor ? 0.9 : 1.5;
    }

    public double calculateCatDailyFood() {
        return super.calculateBaseDailyFood()
                * isIndoorCalcFood();
    }
}
