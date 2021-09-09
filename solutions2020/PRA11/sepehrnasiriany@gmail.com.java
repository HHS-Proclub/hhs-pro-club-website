import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PRA11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA11 p = new PRA11();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String s = in.nextLine();
            outputs.add(p.tasks(s));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int tasks(String s) {
        String[] sArray = s.split(" ");
        List<Integer> events = new ArrayList<>();

        for (String str : sArray) {
            events.add(Integer.parseInt(str));
        }
        Map<Integer, Integer> taskCounts = new HashMap<>();
        int maxCounter = Integer.MIN_VALUE;
        int key = 0;

        for (int num : events) {
            int repeatCount;

            if (!taskCounts.containsKey(num)) {
                repeatCount = 1;
                taskCounts.put(num, repeatCount);

            } else {
                repeatCount = taskCounts.get(num);
                repeatCount++;
                taskCounts.put(num, repeatCount);
            }
            if (repeatCount > maxCounter) {
                maxCounter = repeatCount;
                key = num;
            }
        }
        return key;
    }
}
