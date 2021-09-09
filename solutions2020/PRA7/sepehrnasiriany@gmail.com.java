import java.util.Scanner;

public class PRA7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA7 p = new PRA7();
        String s = in.nextLine();
        s = s.replaceAll("\\s+",  "");
        char[] stringArr = s.toCharArray();

        int maxval = p.largestSubSeq(stringArr, 0, stringArr.length - 1);
        System.out.println(maxval);
        in.close();
    }

    public int largestSubSeq(char[] s, int left, int right) {
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
}
