package bg.tu_varna.sit.lab4.task4;

public class Bike implements Vehicle{
    private int gear;
    private double speed;
    private double riderWeight;

    public Bike(double riderWeight) {
        this.riderWeight = riderWeight;
        this.speed = 0;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public double speedUp(double amount) {
        speed += amount / riderWeight;
        return speed;
    }

    @Override
    public double applyBrakes(double amount) {
        speed = Math.max(0, speed - amount);
        return speed;
    }
}
