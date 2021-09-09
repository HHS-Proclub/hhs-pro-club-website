//package beginner;
import java.util.Scanner;

public class PRB9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] allPerf = new int[10000];
		int clicker = 0;
		for(int i = 0; i<10000; i++) {
			if(isPerfect(i)) {
				allPerf[clicker] = i;
				clicker++;
			}
		}
		
		Scanner kboard = new Scanner(System.in);
		int numOfCases = kboard.nextInt();
		int[] results = new int[numOfCases];
		for(int i = 0; i<numOfCases;i++) {
			int next = kboard.nextInt();
			results[i] = allPerf[next - 1];

		}
		for(int e: results) {
			System.out.println(e);
		}
		
		
		
	}
	
	public static boolean isPerfect(int num) {
		
		int[] digits = new int[5];
		String nums = num +"";
		for(int i = 0; i <nums.length();i++) {
			digits[i] = Integer.parseInt("" +nums.charAt(i));
		}
		
		int sum = 0;
		for(int s : digits) {
			sum += s;
		}
		
		return sum == 10;
		
	}
	/*
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int numOfCases = kboard.nextInt();
		
		int[] input = new int[numOfCases];

		
		for(int i = 0; i<numOfCases; i++) {
			int next = kboard.nextInt();
			input[i] = next;
		}
		
		for(int i = 0;i<numOfCases;i++) {
			System.out.println((input[i] +1)*9 +1);
		}
	}*/

}
