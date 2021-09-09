import java.util.Arrays;
import java.util.Scanner;

public class PRA4 {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(); //5
		int b = s.nextInt();//3
		int c = s.nextInt();//1
		int [] nums = new int[]{a,b,c};
		Arrays.sort(nums);
		if(nums[0] + nums[1] <= nums[2]){
			nums[2] -= (nums[2] - (nums[0] + nums[1]) + 1);
		}
		System.out.println(nums[0] + nums[1] + nums[2]);
		
		
		
	}
}
