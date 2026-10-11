package bg.tu_varna.sit.lab2.classroom.ex5;

public class App {
    public static void main(String args[]) {
        Student student1 = new Student("Ferhat", 25621613);
        Student student2 = new Student( "Sechil", 25623213);
        Student student3 = new Student( "Barush", 25627513);

        System.out.println(student1.getInformation());
        System.out.println(student2.getInformation());
        System.out.println(student3.getInformation());

        Student.university = "Sikish School";

        System.out.println(student1.getInformation());
        System.out.println(student2.getInformation());
        System.out.println(student3.getInformation());

    }
}
