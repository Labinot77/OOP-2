package src.bg.tu_varna.sit.lab3.task8;

public final class Student {
    private final String name;
    private final int facultyNumber;

    public Student(String name, int facultyNumber) {
        this.name = name;
        this.facultyNumber = facultyNumber;
    }

    public String getName() {
        return name;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }
}
