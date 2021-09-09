import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R2B3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        R2B3 r = new R2B3();
        int n = in.nextInt();
        List<Integer> testCases = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sides = in.nextInt();
            testCases.add(sides);
        }
        for (int i : testCases) {
            System.out.println(r.sumAreas(i));

        }
        in.close();
    }
    public int sumAreas(int sides) {
        int sum = 0;
        for (int i = 1; i < sides; i++) {
            sum += i*i;
        }
        return sum;
    }
}
