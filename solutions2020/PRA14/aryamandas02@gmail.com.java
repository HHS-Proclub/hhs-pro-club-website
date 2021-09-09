
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA14 {
    static long globalCount = 0;
    static int maxCount = 0;

    static int globalN = 0;
    static int globalK = 0;

    private static void combination(int curIndex, int[] array) {
        if (curIndex == globalN) {
            // System.out.println(Arrays.toString(array));
            globalCount++;
            return;
        }

        for (int k = 1; k <= globalK; k++) {
            if (curIndex > 0) {
                final int prevVal = array[curIndex - 1];

                if (k >= prevVal) {
                    array[curIndex] = k;
                    combination(curIndex + 1, array);
                } else if (prevVal % k != 0) {
                    array[curIndex] = k;
                    combination(curIndex + 1, array);
                }
            } else {
                array[curIndex] = k;
                combination(curIndex + 1, array);
            }
        }
    }

    private static long getCount(int n, int k) {
        globalK = k;
        globalN = n;
        globalCount = 0;

        final int[] array = new int[n];

        combination(0, array);
        return globalCount;
    }

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        final int cases = in.nextInt();
        in.nextLine();

        final List<Long> outputs = new ArrayList<>();

        for (int i = 0; i < cases; i++) {

            final String s = in.nextLine();
            s.trim();

            final String[] input = s.split(" ");
            final int n = Integer.valueOf(input[0]);
            final int k = Integer.valueOf(input[1]);

            final long count = getCount(n, k);

            outputs.add(count);

        }

        for (final long j : outputs) {
            System.out.println(j);
        }

        in.close();
    }
}
