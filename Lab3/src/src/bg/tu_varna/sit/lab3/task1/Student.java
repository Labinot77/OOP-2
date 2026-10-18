package src.bg.tu_varna.sit.lab3.task1;

public class Student extends Person {
    private int facNumber;

    public Student(String name, int age,int facNumber) {
        super(name, age);
        this.facNumber = facNumber;
    };

    public int getFacNumber() {
        return facNumber;
    }

    public String getStudentInfo() {
        return super.getDesc() + "FacNumber: " + this.facNumber;
    }
}
