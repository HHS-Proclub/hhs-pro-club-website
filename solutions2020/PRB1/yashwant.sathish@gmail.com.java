

import java.util.*;;

public class PRB1 {

	public static void main(String[] args) {
		int ai = 0;
		int bi = 0;
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Print out the number of problems:");
		
		int n = scanner.nextInt();
		
		int[] numbers = new int[n];
		
		//System.out.println("Print out the addends with a space in between:");
		int sum;
		for(int i = 0; i<n; i++) {
			ai = scanner.nextInt();
			bi = scanner.nextInt();
			sum = ai+bi;
			numbers[i] = sum;
			sum = 0;
			
		}
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		scanner.close();
		
		
		
	}

}
