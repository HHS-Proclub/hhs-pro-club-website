

import java.util.Arrays;
import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kboard = new Scanner(System.in);
		int numOfTimes = kboard.nextInt();
		int[] input = new int[numOfTimes];
		for(int i = 0; i<input.length; i++) {
			int inp = kboard.nextInt();
			input[i] = inp;
		}

		for(int i = 0; i<input.length; i++) {
			System.out.println(compute(input[i]));
		}
		
	}
	
	public static int compute(int year) {
		boolean solved = false;
		int stor = year + 1;
		while(!solved) {
			if(isDistinct(stor)) {
				solved = true;
				return stor;
			}else {
				stor++;
			}
			
		}
		return 0;
	
	}
	
	public static boolean isDistinct(int num) {
		int[] numOfTimes = new int[10];
		String nums = num + "";
		for(int i = 0; i<nums.length(); i++) {
			switch(nums.charAt(i)) {
			case '0':
				numOfTimes[0]++;
				break;
			case '1':
				numOfTimes[1]++;
				break;
			case '2':
				numOfTimes[2]++;
				break;
			
			case '3':
				numOfTimes[3]++;
				break;
			
			case '4':
				numOfTimes[4]++;
				break;
			
			case '5':
				numOfTimes[5]++;
				break;
			
			case '6':
				numOfTimes[6]++;
				break;
			
			case '7':
				numOfTimes[7]++;
				break;
			
			case '8':
				numOfTimes[8]++;
				break;
			
			case '9':
				numOfTimes[9]++;
				break;
			

				
			}
		
		}
		
		if(numOfTimes[0] >1 || numOfTimes[1] >1 ||numOfTimes[2] >1 ||numOfTimes[3] >1 ||numOfTimes[4] >1 ||numOfTimes[5] >1 ||numOfTimes[6] >1 ||numOfTimes[7] >1 ||numOfTimes[8] >1 ||numOfTimes[9] >1) {
			return false;
		}else {
			return true;
		}
		
	}

}
