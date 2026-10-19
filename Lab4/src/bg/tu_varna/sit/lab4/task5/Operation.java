package bg.tu_varna.sit.lab4.task5;

@FunctionalInterface // Точно един абстрактен метод

public interface Operation {
    // Всички методи са абстракти в интерфехс
    int apply(int first, int second);

    // void print();

    //Operation има метод, който трябва да бъде реализиран.
    // Pet и Wild нямат методи — самото им имплементиране служи като маркер.
    // @FunctionalInterface помага на компилатора да провери дали интерфейсът има точно един абстрактен метод.
}
