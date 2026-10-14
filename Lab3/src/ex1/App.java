package ex1;

public class App {
    public static void main(String[] args) {
    Person person = new Person("Ferhat", 23);
    Student student = new Student("Sechil", 18 , 26523282);

    System.out.println((person.getInformation()));
    System.out.println(student.getStudentInfo());
    }
}
