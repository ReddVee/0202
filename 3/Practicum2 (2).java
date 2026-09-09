import java.util.ArrayList;

public class Practicum2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println("Расписание кормлений:");
        ArrayList<Integer> feedingOrder = new ArrayList<>();
        feedingOrder.add(1);
        feedingOrder.add(4);
        feedingOrder.add(0);
        feedingOrder.add(2);
        feedingOrder.add(3);
        for (int i = 0; i < feedingOrder.size(); i++) {
            System.out.println("В " + (9 + i) + ":00 - " + animals.get(feedingOrder.get(i)));
        }
    }
}