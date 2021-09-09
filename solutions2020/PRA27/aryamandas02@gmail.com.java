import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRA27 {
    private int n, k;
    private final List<Character> chars = Arrays.asList('A', 'B', 'C');

    private String magicString = "Z";

    public void stringCombs() {
        char[] array = new char[n];
        Arrays.fill(array, 'A');
        stringRecurse(array, 0);

    }

    private boolean stringRecurse(char[] array, int pos) {
        if (pos == n) {
            return lastProblem(array, k);
        }

        for (char c : chars) {
            array[pos] = c;
            if (stringRecurse(array, pos + 1)) {
                return true;
            }
        }
        return false;
    }

    public boolean lastProblem(char[] arr, int k) {
        int countPairs = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int first = arr[i];
                int second = arr[j];
                if (first < second) {
                    countPairs++;
                }
            }
        }
        if (countPairs == k) {
            StringBuilder sb = new StringBuilder();
            for (char c : arr) {
                sb.append(c);
            }
            magicString = sb.toString();
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            PRA27 p = new PRA27();
            p.n = n;
            p.k = k;

            p.stringCombs();
            outputs.add(p.magicString);
        }
        for (String s : outputs) {
            System.out.println(s);
        }
        in.close();
    }

    public static void main0(String[] args) {
        String str = "CABBACCBAABCBBB";
        int countPairs = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == 'A' && str.charAt(j) == 'B') {
                    countPairs++;
                } else if (str.charAt(i) == 'A' && str.charAt(j) == 'C') {
                    countPairs++;
                } else if (str.charAt(i) == 'B' && str.charAt(j) == 'C') {
                    countPairs++;
                }
            }
        }
        System.out.println(countPairs);
    }
}
