import java.util.ArrayList;
import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nums = in.nextInt();
		ArrayList<Integer> ints = new ArrayList<Integer> (nums);
		for (int i = 0; i < nums; i++) {
			ints.add(in.nextInt());
		}
		int target = in.nextInt();
		
		int count = 0;
		for (int i = 0; i < ints.size(); i++) {
			if (ints.get(i) == target) {
				count++;
			}
		}
		
		long chance = Math.round((double)count / nums * 100);
		System.out.println(chance);
	}

}
