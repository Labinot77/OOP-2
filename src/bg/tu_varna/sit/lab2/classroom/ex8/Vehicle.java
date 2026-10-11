package bg.tu_varna.sit.lab2.classroom.ex8;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private int horsepower;

    public static String Manufacter;

    public Vehicle(String brand, String model, int year, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public  int getYear() {
        return this.year;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void changeHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getDescription() {
        return "Brand" + brand
                + "Model" + model
                + "Year " + year
                + "Horsepower" + horsepower;
    }

    public boolean isNew() {
        return this.year > 2020;
    }
}
