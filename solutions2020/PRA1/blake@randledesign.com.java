import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		for(int i = 0; i < x; i++) {
			int year = input.nextInt();
			
			while(!checkDistinct(++year));
			
			System.out.println(year);
		}
		
		input.close();
	}
	
	private static boolean checkDistinct(int y) {
		String s = y+"";
		char[] nums = s.toCharArray();
		
		boolean[] hasNumber = new boolean[10];
		
		for(int i = 0; i < nums.length; i++) {
			if(hasNumber[nums[i]-'0']) {
				return false;
			} else {
				hasNumber[nums[i]-'0'] = true;
			}
		}
		
		return true;
	}
}
