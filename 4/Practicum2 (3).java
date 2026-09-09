import java.util.ArrayList;
import java.util.HashMap;

public class Practicum2 {
    public static void main(String[] args) {
    HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
    ArrayList<Integer> january = new ArrayList<>();
    january.add(1);
    january.add(7);
    ArrayList<Integer> february = new ArrayList<>();
    february.add(23);
    ArrayList<Integer> March = new ArrayList<>();
    March.add(8);
    ArrayList<Integer> May = new ArrayList<>();
    May.add(1);
    May.add(9);
    ArrayList<Integer> june = new ArrayList<>();
    june.add(12);
    ArrayList<Integer> november = new ArrayList<>();
    november.add(4);

    stateHolidays.put("Январь" , january );
    stateHolidays.put("Февраль" , february );
    stateHolidays.put("Март" , March );
    stateHolidays.put("Май" , May );
    stateHolidays.put("Июнь" , june );
    stateHolidays.put("Ноябрь" , november );
    }
}
