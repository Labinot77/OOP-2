package bg.tu_varna.sit.lab4.task1;

public class App {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
    Triangle triangle = new Triangle("Triangle", 2, 3);
    Circle circle = new Circle("Circle", 5);

    System.out.println(rectangle);
    System.out.println(triangle);
    System.out.println(circle);


    // Abstract Shape: Защото геометричната фигура е общо понятие. Не знаем каква е конкретната фигура и как трябва да се изчисли лицето ѝ
        // Защото Shape е абстрактен клас. Не можем да създадем директен обект от него, дори да има конструктор.
    // Shape shape = new Shape("Shape");
    }

}
