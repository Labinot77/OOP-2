package bg.tu_varna.sit.lab2.classroom.ex6;

import bg.tu_varna.sit.lab2.classroom.ex5.Student;

public class App {
    public static void main(String args[]) {
        Book book1 = new Book("  Java Basics  ", "Ivan Ivanov", 2024, 25.50);
        Book book2 = new Book("Java Basics", "Ivan Ivanov", 2024, 25.50);
        Book book3 = new Book("Java Advanced", "Ivan Ivanov", 2024, 25.50);

        System.out.println(book1.title());
        System.out.println(book1.author());
        System.out.println(book1.price());
        System.out.println(book1.year());

        System.out.println(book1);
        // Is true, because its compares the values of the objects;
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

        BookClass classBook1 = new BookClass("Java Basics", "Ivan Ivanov", 2024, 25.50);
        BookClass classBook2 = new BookClass("Java Basics", "Ivan Ivanov", 2024, 25.50);

        System.out.println(classBook1.getTitle());
        // Is false because it compares the objects itself
        System.out.println(classBook1 == classBook2);
        System.out.println(classBook1.equals(classBook2));
        System.out.println(classBook1);



    }
}
