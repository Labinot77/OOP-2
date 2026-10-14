package ex1;

public class Student extends Person {
    private int facultyNumber;

    public Student(String name, int age, int facultyNumber) {
        super(name, age); // Calls the parameters of the class it extends to.
        super.getInformation(); // You can call parent methods.
        this.facultyNumber = facultyNumber;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public String getStudentInfo() {
        return getInformation() + "Faculty Number" + this.facultyNumber;
    }
}
