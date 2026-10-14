package bg.tu_varna.sit.lab2.classroom.ex9;

public class StudentClass {
    private String name;
    private int facultyNumber;

    // Статичното поле принадлежи на класа и е общо за всички обекти.
//    this не може да се използва в статичен метод, защото той няма текущ обект.
    public static String university;

    public StudentClass(String name, int facultyNumber) {
        this.name = name;
        this.facultyNumber = facultyNumber;
    };

    public String getName() {
        return this.name;
    }

    public int getFacultyNumber() {
        return this.facultyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return "Name, " + this.getName() + ", Faculty Number" + this.getFacultyNumber() + ", University" + university;
    }

    public void printCard() {
        StudentPrinter.print(this);
    }


}
