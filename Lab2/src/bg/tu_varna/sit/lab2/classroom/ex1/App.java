package bg.tu_varna.sit.lab2.classroom.ex1;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("Maya");
        cat.setBreed("Persian");
        cat.setAge(3);
        cat.setWeight(4.2);

        System.out.println(cat.getName());
        System.out.println(cat.getBreed());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());
    }

}
