import java.util.ArrayList;
import java.util.Scanner;

public class Practicum3 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Показать список всех животных в зоопарке.");
            System.out.println("2 - Добавить животное в список.");
            System.out.println("3 - Удалить животное из списка.");
            System.out.println("4 - Очистить список.");
            System.out.println("5 - Проверить, есть ли в зоопарке указанное пользователем животное.");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    for (String animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                case 2:
                    System.out.println("Введите название животного:");
                    String animalAdd = scanner.nextLine();
                    animals.add(animalAdd);
                    break;
                case 3:
                    if (!animals.isEmpty()) {
                        System.out.println("Введите название животного:");
                        String animalRemove = scanner.nextLine();
                        animals.remove(animalRemove);
                    }else {
						System.out.println("Такого животного нет в зоопарке.");
                    break;
                case 4:
                    if (!animals.isEmpty()) {
                        animals.clear();
                    }
                    break;

                case 5:
                    System.out.println("Введите название животного:");
                    String animalCheck = scanner.nextLine();
                    if (animals.contains(animalCheck)) {
                        System.out.println("Животное есть в зоопарке.");
                    } else {
                        System.out.println("Животного нет в зоопарке.");
                    }
                    break;
            }
        }
    }
}