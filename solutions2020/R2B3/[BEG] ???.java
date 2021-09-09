import java.util.Scanner;

public class R2B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i<n ; i++){
			nums[i] = keyboard.nextInt();			
		}
		
		int sum = 0;
		for(int i = 0; i<nums.length; i++){
			sum = 0;
			for (int j = 1; j < nums[i]; j++) {
				sum += j*j;
				
			}
			System.out.println(sum);
		}
		
	}

}
