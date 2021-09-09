import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PRA18 {
    public static void main(String[] args) {
        PRA18 p = new PRA18();
        Scanner in = new Scanner(System.in);
        String cases = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String str = in.nextLine();
            outputs.add(p.isGoodString(str));
        }
        for (String s : outputs) {
            System.out.println(s);
        }
        in.close();
    }
    public String isGoodString(String s) {
        if (s.isEmpty()) {
            return "Good";
        }
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!counts.containsKey(c)) {
                counts.put(c, 1);

            } else {
                int repeatCount = counts.get(c);
                repeatCount++;
                counts.put(c, repeatCount);
            }
        }
        Set<Integer> vals = new HashSet<>();

        for (int j : counts.values()) {
            vals.add(j);
        }
        if (vals.size() != 1) {
            return "Bad";
        }
        Set<Character> virus = new LinkedHashSet<>();

        for (int k = 0; k < s.length(); k++) {
            virus.add(s.charAt(k));
        }

        Map<Character, Integer> countMap = new LinkedHashMap<>();
        int d = 0;
        for (char ch : virus) {
            countMap.put(ch, d++);
        }

        int[] countVals = new int[countMap.size()];

        for (int chIndex = 0; chIndex < s.length(); chIndex++) {
            char ch = s.charAt(chIndex);
            int index = countMap.get(ch);
            countVals[index] += 1;

            if (index >= 1) {
                if (countVals[index] > countVals[index-1]) {
                    return "Bad";
                }
            }
        }
        return "Good";
    }
}