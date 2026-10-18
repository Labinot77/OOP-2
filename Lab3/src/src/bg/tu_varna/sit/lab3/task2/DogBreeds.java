package src.bg.tu_varna.sit.lab3.task2;

public enum DogBreeds {
    FRENCH_BULLDOG(1.4),
    LABRADOR_RETRIEVER(1.9),
    GERMAN_SHEPHERD(1.7),
    CHIHUAHUA(0.8);

    private final double foodMultiplier;

    DogBreeds(double foodMultiplier) {
        this.foodMultiplier = foodMultiplier;
    }

    public double getFoodMultiplier() {
        return foodMultiplier;
    }

}
