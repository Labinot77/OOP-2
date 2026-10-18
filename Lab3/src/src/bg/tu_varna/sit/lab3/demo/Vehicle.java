package src.bg.tu_varna.sit.lab3.demo;

// If we remove public, the class will only be avaible to this package
public class Vehicle {
    protected String regNumber;
    protected String brand;
    protected int year;
    private int mileage;

    public Vehicle(String regNumber, String brand, int year, int mileage) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVehicleDescription() {
        return "REG: " + this.regNumber + "Brand: " + this.brand + "Year: " + this.year;
    }

    public double calcvehServiceCost() {
        return 100 + mileage * 0.05;
    }
}
