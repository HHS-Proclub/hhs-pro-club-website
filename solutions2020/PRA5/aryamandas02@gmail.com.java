
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRA5 {

    private static Collection<Character> vowels = Arrays.asList(' ', 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
    private static Set<Character> vowelset = new HashSet<>(vowels);

    static boolean isVowelOrBlank(char c) {
        return vowelset.contains(c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            String n = in.nextLine();
            if (n.isEmpty()) {
                outputs.add("");
            } else {
                String output = typo(n);
                outputs.add(output);
            }
        }
        for (String o : outputs) {
            System.out.println(o);
        }
        in.close();
    }

    public static String typo(String input) {
        char[] op1 = fixTypo(input.toCharArray());
        //System.out.println(new String(op1));

        char[] inputRev = reverse(input.toCharArray());
        char[] opreverse = fixTypo(inputRev);
        //System.out.println(new String(opreverse));
        char[] op2 = reverse(opreverse);

        if (op1.length <= op2.length) {
            return new String(op1);
        } else {
            return new String(op2);
        }
    }

    static char[] fixTypo(char[] input) {
        List<Character> output = new ArrayList<>();

        int consonantCount = (isVowelOrBlank(input[0])) ? 0 : 1;
        output.add(input[0]);

        for (int i = 1; i < input.length; i++) {
            char c = input[i];

            if (isVowelOrBlank(c)) {
                consonantCount = 0;
            } else {

                //if (Character.toLowerCase(c) != Character.toLowerCase(input[i - 1])) {
                if (c != input[i-1]) {
                    consonantCount++;
                } else {
                    consonantCount = 1;
                }

                if (consonantCount == 3) {
                    output.add(' ');
                    consonantCount = 1;
                }
            }
            output.add(c);
        }

        return listToArray(output);
    }

    private static char[] listToArray(List<Character> output) {
        char[] op = new char[output.size()];
        for (int i = 0; i < op.length; i++) {
            op[i] = output.get(i);
        }
        return op;
    }

    static char[] reverse(char[] input) {
        int len = input.length;
        char[] output = new char[len];
        for (int i = 0; i < len; i++) {
            output[i] = input[len - 1 - i];
        }
        return output;
    }
}
