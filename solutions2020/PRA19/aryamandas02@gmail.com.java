import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRA19 {

    private static List<Integer> choice1 = Arrays.asList(4, 4);
    private static List<Integer> choice2 = Arrays.asList(4, 7);
    private static List<Integer> choice3 = Arrays.asList(7, 7);

    private static List<List<Integer>> choices = Arrays.asList(choice1, choice2, choice3);

    private static int sum = Integer.MAX_VALUE;

    private String note;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRA19 p = new PRA19();
        List<Integer> outputs = new ArrayList<>();
        String t = in.nextLine();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            sum = Integer.MAX_VALUE;
            p.note = in.nextLine();
            int n = p.note.length();
            p.luckySumRecurse(n);
            if (n > 1) {
                p.luckySumRecurse(n-1);
            }
            if (sum == Integer.MAX_VALUE) {
                outputs.add(-1);
            } else {
                outputs.add(sum);
            }
        }
        for (int o : outputs) {
            System.out.println(o);
        }
        in.close();
    }
    public void luckySumRecurse(int size) {
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        Arrays.fill(array1, 0);
        Arrays.fill(array2, 0);

        arrayRecurse(array1, array2, 0, false);

    }
    public void arrayRecurse(int[] array1, int[] array2, int pos, boolean leadingSpace) {
        if (pos == array1.length) {
            int val1 = convertToInteger(array1);
            int val2 = convertToInteger(array2);

            int valsSum = val1 + val2;
            String str = String.valueOf(valsSum);

            if (str.length() == note.length()) {
                for (int in = 0; in < note.length(); in++) {
                    if (note.charAt(in) != '?') {
                        if (note.charAt(in) != str.charAt(in)) {
                            return;
                        }
                    }
                }
                if (valsSum < sum) {
                    //System.out.println("val1: " + val1 + "  val2: " + val2);
                    sum = valsSum;
                }
            }
            /*
             * find the sum; match it with input. If matches,
             * then check to see if it less than the sum
             * we have recorded so far
             */
            return;

        } else {
            if (!leadingSpace) {
                for (List<Integer> list : choices) {
                    array1[pos] = list.get(0);
                    array2[pos] = list.get(1);
                    arrayRecurse(array1, array2, pos + 1, leadingSpace);
                }

                /*
                 * Choose only array1
                 * You have two choices:
                 * 4 and 7
                 * Put 4, and recurse with true
                 * Put 7, and recurse with true
                 */
                if (pos > 0) {
                    for (int elem : choice2) {
                        array1[pos] = elem;
                        array2[pos] = 0;
                        arrayRecurse(array1, array2, pos + 1, true);
                    }
                }
            } else {
                /*
                 * Choose only array1
                 * You have two choices:
                 * 4 and 7
                 * Put 4, and recurse with true
                 * Put 7, and recurse with true
                 */
                for (int elem : choice2) {
                    array1[pos] = elem;
                    array2[pos] = 0;
                    arrayRecurse(array1, array2, pos + 1, true);
                }
            }
        }
    }
    private int convertToInteger(int[] array1) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array1.length; i++) {
            sb.append(array1[i]);
        }
        sb.reverse();
        int val = Integer.valueOf(sb.toString());
        return val;
    }
}
