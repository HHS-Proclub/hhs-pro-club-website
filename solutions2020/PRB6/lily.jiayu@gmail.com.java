import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB6 {
    private static final List<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PRB6 p = new PRB6();

        for (int i = 0; i < 5; i++) {
            nums.add(in.nextInt());
        }
        System.out.println(p.largestNumber());
        in.close();
    }
    public int largestNumber() {
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == (sum - nums.get(i))) {
                return nums.get(i);
            }
        }
        return sum;
    }
}
