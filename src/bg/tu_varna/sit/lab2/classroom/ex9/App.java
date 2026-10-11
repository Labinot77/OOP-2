package bg.tu_varna.sit.lab2.classroom.ex9;

public class App {
    public static void main(String args[]) {
        Student student1 = new Student("Ferhat", 25621613);
        Student student2 = student1;
        Student student3 = new Student( "Barush", 25627513);

        System.out.println(student1 == student2);
        System.out.println(student1 == student3);

        student2.setName("Petur");

        student1.getInformation();

        StudentPrinter.print(student3);
    }
}
