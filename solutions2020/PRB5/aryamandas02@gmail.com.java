import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        List<Long> outputs = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            String n = in.nextLine();
            try {
                outputs.add(rounding(n));
            } catch (NumberFormatException ex) {
                outputs.add((long) 0);
            }
        }
        for (long o : outputs) {
            System.out.println(o);
        }
        in.close();
    }

    public static long rounding(String str) {
        String[] strArray = str.split(" ");
        long n = Long.parseLong(strArray[0]);
        int k = Integer.parseInt(strArray[1]);
        if (n <= 0 || k <= 0)
            return 0;

        if (getZeroCount(n) == k) {
            return n;
        }
        long num = (long) Math.pow(10, k);

        if (num % n == 0) {
            return num;
        }
        int start = (int) (num / n);

        while (true) {
            long result = start * n;
            int count = getZeroCount(result);

            if (count == k) {
                return result;
            }
            start += 1;
        }
    }

    private static int getZeroCount(long st) {
        if (st == 0)
            return 1;

        int count = 0;
        while (st > 0) {
            if (st % 10 == 0)
                count++;
            st = st / 10;

        }
        return count;
    }
}
