package bg.tu_varna.sit.lab2.classroom.ex9;

public class App {
    public static void main(String[] args) {
        StudentClass studentClass1 = new StudentClass("Ferhat", 25621613);
        StudentClass studentClass2 = studentClass1;
        StudentClass studentClass3 = new StudentClass( "Barush", 25627513);

        System.out.println(studentClass1 == studentClass2);
        System.out.println(studentClass1 == studentClass3);

        studentClass2.setName("Petur");

        studentClass1.getInformation();

        StudentPrinter.print(studentClass3);

        Student recordStudent = new Student("Sechil", 25621232);

        System.out.println(recordStudent.Name());
        System.out.println(recordStudent.Check());
    }
}
