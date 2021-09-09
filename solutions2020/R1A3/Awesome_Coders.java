import java.util.Arrays;
import java.util.Scanner;

public class R1A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        R1A3 r = new R1A3();
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        System.out.println(r.isAnagram(word1, word2));
        in.close();
    }
    public String isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return "NO";
        }
        if (word1.equals(word2)) {
            return "YES";
        }
        if (word1 == null || word1.isEmpty()) {
            return "NO";

        } else if (word2 == null || word2.isEmpty()) {
            return "NO";
        }
        char[] word1array = word1.toCharArray();
        Arrays.sort(word1array);
        String newWord1 = new String(word1array);
        char[] newWord1array = newWord1.toCharArray();
        char[] word2array = word2.toCharArray();
        Arrays.sort(word2array);
        String newWord2 = new String(word1array);
        char[] newWord2array = newWord2.toCharArray();

        for (int i = 0; i < newWord1array.length; i++) {
            if (newWord1array[i] != newWord2array[i]) {
                return "NO";
            }
        }
        return "YES";
    }
}
