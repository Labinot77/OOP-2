package bg.tu_varna.sit.lab2.classroom.ex5;

public class Student {
    private String name;
    private int facultyNumber;

    // Статичното поле принадлежи на класа и е общо за всички обекти.
    public static String university;

    public Student(String name, int facultyNumber) {
        this.name = name;
        this.facultyNumber = facultyNumber;
    };

    public String getInformation() {
        return "Name, " + name + ", Faculty Number" + facultyNumber + ", University" + university;
    }


}
