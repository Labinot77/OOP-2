package bg.tu_varna.sit.lab4.task3;

public class Bird extends Animal implements Wild{
     public Bird(String name, int age) {
         super(name,age);
     }

     @Override
        String sound() {
         return "bird";
     }

     @Override
    public String move() { // Needs to be public because its coming from the interface
         return "Bird Moving";
     }
}
