package bg.tu_varna.sit.lab2.classroom.ex9;

// Records components are automaticly FINAL. You cannot reassign new values after declaring ones when creating the object
public record Student(String Name, int FacultyNumber) {

    // We can still use methods and chack like normal inside

    public Student {


        if (FacultyNumber == 0) {}
    }


    public String Check() {
        return "Something here";
    }


}