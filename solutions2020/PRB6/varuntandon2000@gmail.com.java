import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] nums = new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
			sum += nums[i];
		int retVal = sum;
		for(int i = 0; i <  nums.length; i++){
			for(int j = 0; j < nums.length; j++){
				if(sum - nums[i] == nums[j])
					retVal = nums[j];
			}
		}
		System.out.println(retVal);
	}

}
