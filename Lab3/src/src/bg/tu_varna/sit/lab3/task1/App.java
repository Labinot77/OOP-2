package src.bg.tu_varna.sit.lab3.task1;

public class App {
    public static void main(String[] args) {
    Person person = new Person("Ferhat", 22);
    Student student = new Student("Pavel", 23, 321939712);

    System.out.println(person.getDesc());
        System.out.println(student.getStudentInfo());

    }
}
