import java.util.Arrays;
import java.util.Scanner;

public class PRB3_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int seqs = Integer.parseInt(s.nextLine());
		String result = "";
		for (int seq = 0; seq < seqs; seq++) {
			int num = Integer.parseInt(s.nextLine());
			String[] numData = s.nextLine().split(" ");
			int[] nums = new int[numData.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(numData[i]);
			}
			
			if (nums.length == 1) {
				result += "1\n";
			} else {
				int toRemove = 0;
				
				outer: for (int i = 0; i < nums.length; i++) {
					for (int j = 0; j < nums.length; j++) {
						if (!(i == j) && isPow2(nums[i] + nums[j])) {
							continue outer;
						}
					}
					toRemove += 1;
				}
				result += toRemove + "\n";
			}
		}
		
		System.out.println(result);
		
		s.close();
	}
	
	public static boolean isPow2(int x) {
		while (x > 1) {
			if (x%2 == 0) {
				x/=2;
			} else {
				return false;
			}
		}
		
		return true;
	}
}
