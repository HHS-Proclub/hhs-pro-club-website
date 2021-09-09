import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRB7 {
	private List<Integer> nums = Arrays.asList(1, 6, 28, 120, 496, 2080, 8128, 32640);
	
	public static void main(String[] args) {
		PRB7 p = new PRB7();
		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.nextLine());
        List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            int n = in.nextInt();
            outputs.add(p.greatestDivisor(n));
        }
        for (int o : outputs) {
            System.out.println(o);
        }
        in.close();
	}
	public int greatestDivisor(int num) {
		for (int i = nums.size()-1; i >= 0; i--) {
			if (num % nums.get(i) == 0) {
				return nums.get(i);
			}
		}
		return -1;
	}
}
