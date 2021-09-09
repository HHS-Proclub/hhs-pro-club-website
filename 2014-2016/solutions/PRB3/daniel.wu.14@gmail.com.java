import java.util.*;

public class PRB3 {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int numNums = io.nextInt();
		int[] nums = new int[numNums];
		for(int i = 0; i < numNums; i++){
			nums[i] = io.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[numNums-1]);
	}
}
