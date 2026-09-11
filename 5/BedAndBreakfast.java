//Задание 2
 public class BedAndBreakfast { // сделайте класс общедоступным

    private int capacity = 10;

    private boolean full= false;

    void book() { // метод для бронирования комнат
        if (!full) { // если есть свободные номера
            System.out.println("Забронирован ещё один номер!");
            capacity --;
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

    void printRooms() {
        System.out.println("Свободных номеров - " + capacity);
    }

    void free() { // метод для освобождения комнат
        if (capacity<10) { // если свободных комнат меньше 10
            capacity++; // увеличиваем количество свободных мест на одно
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    boolean isFull() {
        return full;
    }
}

