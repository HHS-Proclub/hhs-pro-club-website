import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PRA4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            String n = in.nextLine();
            int output = foobar(n);
            outputs.add(output);
        }
        for (long o : outputs) {
            System.out.println(o);
        }
        in.close();
    }

    public static int foobar(String str) {
        int[] array = convertToIntArray(str);
        int sum = 0;
        for (int i : array)
            sum += i;
        if (sum % 3 == 0) {
            return 0;
        }

        int count = array.length - 1;

        while (count > 0) {
            if (printCombinations(array, count)) {
                return array.length - count;
            }
            count--;
        }
        return -1;
    }

    public static boolean printCombinations(final int[] array, final int count) {
        final Stack<Integer> output = new Stack<>();
        return printCombinations(array, output, 0, count);
    }

    public static boolean printCombinations(final int[] array, final Stack<Integer> output, final int start,
            final int count) {
        if (count == 0) {
            return (isDivBy3(output));
        }

        for (int i = start; i < array.length; i++) {
            if (output.isEmpty() && array[i] == 0) {
                continue;
            }
            output.push(array[i]);
            boolean flag = printCombinations(array, output, i + 1, count - 1);
            output.pop();
            if (flag)
                return true;
        }
        return false;
    }

    static boolean isDivBy3(Stack<Integer> s) {
        int sum = 0;
        for (int i : s) {
            sum += i;
        }

        return (sum % 3 == 0);
    }

    static int[] convertToIntArray(String s) {
        char[] arr = s.toCharArray();
        int[] intarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intarr[i] = Integer.parseInt(String.valueOf(arr[i]));
        }
        return intarr;
    }
}
