package src.bg.tu_varna.sit.lab3.task8;

import src.bg.tu_varna.sit.lab3.Utils;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
    Student student1 = new Student("Ferhat", 25621613);
    Student student2 = new Student("Ferhat", 25621613);

    StudentCardRecord record1  = new StudentCardRecord("Sechil", 25625555);
    StudentCardRecord record2  = new StudentCardRecord("Sechil", 25625555);

    Utils.print(student1.getName());
    Utils.print(student1.getFacultyNumber());

    Utils.print(record1.facultyNumber());
    Utils.print(record1.name());

    Utils.print(student1.equals(student2)); // they are two separate objects in memory. That is why they return false,
    Utils.print(record1.equals(record2)); // Because It compares the values of the components:

    Utils.print(student1.toString());
    Utils.print(record1.toString());


//  Explain later
        int[] marks = {5, 6, 4};
        int[] marks2 = {5, 6, 4};
        SafeGrades g = new SafeGrades(marks);

        marks[0] = 2;
        // SafeGrades protects its own copy, that doesn't mean that here in this file it will protect this as well
        System.out.println(g.grades()[0]); // 5

        int[] result = g.grades();
        result[1] = 3;

        System.out.println(g.grades()[1]); // 6

    // При record с масив автоматичният equals() също не сравнява съдържанието на масивите по елементи,
        // а техните референции. Ако искаме сравнение по оценки, трябва да предефинираме equals() и hashCode() с
        // Arrays.equals() и Arrays.hashCode().
        marks[0] = 5; // Changing back the original number of the array.
        Utils.print(g.grades().equals(marks2));
        System.out.println(Arrays.equals(marks, marks2));
    }
}
