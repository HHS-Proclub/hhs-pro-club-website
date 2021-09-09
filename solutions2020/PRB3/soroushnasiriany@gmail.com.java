import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB3 {
    public static void main(String[] args) {
        PRB3 p = new PRB3();

        try (Scanner in = new Scanner(System.in)) {

            int a = in.nextInt();
            List<Integer> nums = new ArrayList<>();

            for (int i = 0; i < a; i++) {
                int x = in.nextInt();
                nums.add(x);
            }

            for (int j : nums) {
                p.divisors(j);
            }
        }
    }
    public void divisors(int x) {
        for (int i = 1; i <= x/2; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(x);
    }
}
