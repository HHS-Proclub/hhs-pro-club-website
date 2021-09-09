import java.util.*;

public class PRB7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		System.out.println(countClumps(str.split(",")));
	}
	public static int countClumps(String[] nums){
		int c = 0;
		boolean repeat = false;
		for(int i = 0; i < nums.length - 1; i++){
			if(repeat){
				if(!nums[i].trim().equals(nums[i + 1].trim()))
					repeat = false;
			}
			else if(nums[i].trim().equals(nums[i + 1].trim())){
				repeat = true;
				c++;
			}
		}

		return c;
	}
}