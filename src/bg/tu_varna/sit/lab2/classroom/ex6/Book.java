package bg.tu_varna.sit.lab2.classroom.ex6;

public record Book(String title, String author, int year, double price) {
    public Book {
        title = title.trim(); // Removes any unwanted spaces
    }
}
