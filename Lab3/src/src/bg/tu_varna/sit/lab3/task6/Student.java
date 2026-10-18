package src.bg.tu_varna.sit.lab3.task6;

public class Student {
    private String name;
    private int facultyNumber;
    protected String specialty;
    public static String university;

    public Student(String name, int facultyNumber, String specialty) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public String getSpecialty() {
        return specialty;
    }


}
