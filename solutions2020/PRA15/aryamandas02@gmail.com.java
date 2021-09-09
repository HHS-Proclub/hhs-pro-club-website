import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PRA15 {
    public static void main(String[] args) {
        PRA15 p = new PRA15();
        Scanner in = new Scanner(System.in);
        String cases = in.nextLine();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(cases); i++) {
            String s = in.nextLine();
            outputs.add(p.largestSquareString(s));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int largestSquareString(String s) {
        char[] charsArray = removeSingleOccuranceCharcters(s);

        int largestLength = 0;


        for (int i = 0; i < charsArray.length; i++) {
            char[] newArray = reverseArray(charsArray, i);

            // System.out.println(new String(newArray));

            int length = largestSubSeq(newArray, 0, newArray.length - 1);

            int splitSize = Math.min(i,  newArray.length-i);
            length = Math.min(2*splitSize, length);

            if (length % 2 != 0) {
                length--;
            }

            if (length > largestLength) {
                largestLength = length;
            }
        }

        return largestLength;
    }

    private char[] removeSingleOccuranceCharcters(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        char[] chararray = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chararray) {
            if (!counts.containsKey(c)) {
                counts.put(c, 1);

            } else {
                int repeatCount = counts.get(c);
                repeatCount++;
                counts.put(c, repeatCount);
            }
        }
        for (char c : chararray) {
            if (counts.get(c) > 1) {
                sb.append(c);
            }
        }

        return sb.toString().toCharArray();
    }

    private int largestSubSeq(char[] s, int left, int right) {
        if (left > right) {
            return 0;
        }
        if (left == right) {
            return 1;
        }

        if (right == left + 1 && s[left] == s[right]) {
            return 2;
        }

        if (s[left] == s[right]) {
            return 2 + largestSubSeq(s, left + 1, right - 1);

        } else {
            int largestLength1 = largestSubSeq(s, left, right - 1);
            int largestLength2 = largestSubSeq(s, left + 1, right);

            return Math.max(largestLength1, largestLength2);
        }
    }

    private char[] reverseArray(char[] input, int start) {

        char[] output = new char[input.length];

        int pos = 0;
        for (int i = 0; i < start; i++) {
            output[pos] = input[i];
            pos++;
        }

        for (int i = input.length-1; i >= start; i--) {
            output[pos] = input[i];
            pos++;
        }

        return output;


    }
}