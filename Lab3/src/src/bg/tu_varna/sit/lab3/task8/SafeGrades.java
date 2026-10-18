package src.bg.tu_varna.sit.lab3.task8;
import java.util.Arrays;

// final int[] grades = {5, 6, 4};
// grades[0] = 2;             // Позволено
// grades = new int[3];    // Грешка

public record SafeGrades(int[] grades) {
    public SafeGrades { // Constructor
        grades = Arrays.copyOf(grades, grades.length);
    }

    public int[] grades() { // Accessor
        return Arrays.copyOf(grades, grades.length);
    }
}
