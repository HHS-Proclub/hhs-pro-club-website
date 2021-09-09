import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PROCO4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<String> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().trim().split(" ");
            String s = input[0];
            String t = input[1];

            output.add(canBeTransformed(s, t));

        }
        // System.out.println(canBeTransformed("rdmcxnnbbe", "rdqrxrnxbe"));
        // System.out.println(canBeTransformed("rdmcxnnbbe", "rdrrxrnxbe"));

        for (String s : output) {
            System.out.println(s);
        }

        in.close();
    }

    static String canBeTransformed(String s, String t) {
        if (s.equals(t)) {
            return "Possible";
        }

        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();

        if (sarray[0] != tarray[0]) {
            return "Impossible";
        }

        List<Integer> differList = new ArrayList<>();

        for (int index = sarray.length - 1; index >= 0; index--) {
            if (sarray[index] != tarray[index]) {
                differList.add(index);
            }
        }

        Map<Character, Set<Integer>> map = new HashMap<>();
        for (int index = 0; index < sarray.length; index++) {
            char c = sarray[index];
            Set<Integer> set = map.get(c);
            if (set == null) {
                set = new HashSet<Integer>();
                map.put(c, set);
            }
            set.add(index);
        }

        for (int differIndex : differList) {
            char tchar = tarray[differIndex];

            Set<Integer> set = map.get(tchar);
            if (set == null) {
                return "Impossible";
            }

            boolean foundSmallerIndex = false;
            for (int index : set) {
                if (index < differIndex) {
                    foundSmallerIndex = true;
                    break;
                }
            }

            if (!foundSmallerIndex) {
                return "Impossible";
            }
        }
        return "Possible";
    }
}
