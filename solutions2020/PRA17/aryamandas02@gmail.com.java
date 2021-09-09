import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PRA17 {
    public static void main(String[] args) {
        PRA17 p = new PRA17();
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            int n = in.nextInt();
            outputs.add(p.oddDivisors(n));
        }
        for (int j : outputs) {
            System.out.println(j);
        }
        in.close();
    }
    public int oddDivisors(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += largestOddDivisor(i);
        }
        return sum;
    }
    private int largestOddDivisor(int num) {
        int large = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && i % 2 != 0 && i > large) {
                large = i;
            }
        }
        return large;
    }
}
