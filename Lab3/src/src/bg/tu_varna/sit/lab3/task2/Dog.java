package src.bg.tu_varna.sit.lab3.task2;

import javax.naming.ServiceUnavailableException;

public class Dog extends Animal{
    private DogBreeds breed;
    private String learnedCommands;

    public Dog(String name, int age, double weight, DogBreeds breed, String learnedCommands) {
        super(name,age,weight);
//        this.breed = DogBreeds.valueOf(breed); // valueof, only if it mataches the exact string;
        this.breed = breed;
        this.learnedCommands = learnedCommands;
    }

    public String getDogDescription() {
        return super.getDesc();
    }


    public double calculateDogDailyFood() {
        return super.calculateBaseDailyFood()
                * this.breed.getFoodMultiplier();
    }
}
