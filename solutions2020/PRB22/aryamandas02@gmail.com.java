import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PRB22 {
    public static void main(String[] args) {
        PRB22 p = new PRB22();
        Scanner in = new Scanner(System.in);

        String diet = in.nextLine();
        String breakfast = in.nextLine();
        String lunch = in.nextLine();

        System.out.println(p.dietPlan(diet, breakfast, lunch));
        in.close();

    }
    public String dietPlan(String diet, String breakfast, String lunch) {
        if (breakfast.isEmpty() || lunch.isEmpty()) {
            return "CHEATER";
        }
        List<Character> dietFood = new ArrayList<>();

        for (int i = 0; i < diet.length(); i++) {
            dietFood.add(diet.charAt(i));
        }
        Collections.sort(dietFood);
        String meal = breakfast + lunch;
        List<Character> meals = new ArrayList<>();

        for (int i = 0; i < meal.length(); i++) {
            meals.add(meal.charAt(i));
        }
        Collections.sort(meals);
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : meals) {
            if (!counts.containsKey(c)) {
                counts.put(c, 1);
            } else {
                int repeatCount = counts.get(c);
                repeatCount++;
                counts.put(c, repeatCount);
            }
        }
        for (char food : counts.keySet()) {
            if (!dietFood.contains(food)) {
                return "CHEATER";
            }
        }
        for (int count : counts.values()) {
            if (count != 1) {
                return "CHEATER";
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char d : dietFood) {
            if (!meals.contains(d)) {
                sb.append(d);
            }
        }
        return sb.toString();
    }
}
