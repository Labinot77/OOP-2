package bg.tu_varna.sit.lab2.classroom.ex9;

public class StudentPrinter {
        // By using static, I'm not required to create a new Object. I can directly call StudentPrinter.print();
        public static void print(StudentClass studentClass) {
        System.out.println(studentClass.getName());
        System.out.println(studentClass.getFacultyNumber());
    }
}
