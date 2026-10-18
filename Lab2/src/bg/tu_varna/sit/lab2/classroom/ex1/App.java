package bg.tu_varna.sit.lab2.classroom.ex1;

import static bg.tu_varna.sit.lab2.classroom.Utils.print;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("Maya");
        cat.setBreed("Persian");
        cat.setAge(3);
        cat.setWeight(4.2);

        print(cat.getName());
        print(cat.getBreed());
        print(cat.getAge());
        print(cat.getWeight());
    }

}
