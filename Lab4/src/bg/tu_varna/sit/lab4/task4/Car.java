package bg.tu_varna.sit.lab4.task4;

public class Car implements Vehicle{
    private int gear;
    private double speed;
    private double power;

    public Car(double power) {
        this.power = power;
        this.speed = 0;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public double speedUp(double amount) {
        speed += amount * power / 100;
        return speed;
    }

    @Override
    public double applyBrakes(double amount) {
        speed = Math.max(0, speed - amount);
        return speed;
    }
}
