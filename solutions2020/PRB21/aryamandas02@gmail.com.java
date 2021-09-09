import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PRB21 {
    public static void main(String[] args) {
        PRB21 p = new PRB21();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int n = in.nextInt();

        System.out.println(p.additionGame(a, b, c, n));
        in.close();

    }
    public int additionGame(int a, int b, int c, int n) {
        List<Integer> nums = new ArrayList<>();
        nums.add(a);
        nums.add(b);
        nums.add(c);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            Collections.sort(nums);
            int last = nums.get(nums.size() - 1);
            sum += last;
            last--;
            nums.set(nums.size() - 1, last);

            if (nums.get(0) == 0 && nums.get(1) == 0 && nums.get(2) == 0) {
                break;
            }
        }
        return sum;
    }
}
