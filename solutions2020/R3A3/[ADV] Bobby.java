//package R3;

import java.util.Scanner;

public class R3A3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] numbers=(in.nextLine()).toCharArray();
		for (int i = 0; i<numbers.length; i++){
			if (numbers[i] == '.' || numbers[i]=='-'){
				numbers[i]='0';
			}
		}
		int sum=0;
		for (int i = 0; i<numbers.length; i++){
			sum += Character.getNumericValue(numbers[i]);
		}
		System.out.println(sum);
	}
	
}
