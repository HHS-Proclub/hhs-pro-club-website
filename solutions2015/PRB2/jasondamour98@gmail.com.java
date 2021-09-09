package Beginner;

import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int limit1 = Integer.parseInt(in.nextLine());
		int limit2 = Integer.parseInt(in.nextLine());
		double posAvg = 0;
		
		for(int i = limit1; i < limit2; i++){
			if(i > 0)
				posAvg += i;
		}		
		System.out.println(posAvg / (limit2 - 1));
	}

}
