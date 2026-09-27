import java.util.ArrayList;
import java.util.Scanner;
//237 группа
//Задание 1
public class Practicum {
    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");
        Forest forest = new Forest(hares);
        forest.setSeason("Лето");

        System.out.println("Список зайцев:");
        forest.printHares();

        System.out.println("В лесу зима!");
        forest.setSeason("Зима");

        System.out.println("Список зайцев:");
        forest.printHares();
    }

    public static class MountainHare {
        int age;
        double weight;
        double jumpLength;
        static String color;

        public MountainHare(int age, double weight, double jumpLength) {
            this.age = age;
            this.weight = weight;
            this.jumpLength = jumpLength;
        }

        @Override
        public String toString() {
            return "Заяц-беляк: " +
                    "age=" + age +
                    ", weight=" + weight +
                    ", jumpLength=" + jumpLength +
                    ", color=" + color +
                    '.';
        }
    }

    public static class Forest {
        private ArrayList<MountainHare> hares;

        public Forest(ArrayList<MountainHare> hares) {
            this.hares = hares;
        }

        // объявите недостающие переменные и добавьте конструктор
        private static String season;

        // добавьте метод setSeason(String newSeason)
        static void setSeason(String newSeason){
            season = newSeason;
            if (season.equalsIgnoreCase("зима")) MountainHare.color = "белый";
            else MountainHare.color = "серо-рыжий";

        }
        // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

        // добавьте метод printHares()
        public void  printHares() {
            if(hares != null)
            for (MountainHare hare : hares) {
                System.out.println(hare);
            }
        }
    }
}