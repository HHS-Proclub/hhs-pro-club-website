package lmao;

import java.util.Scanner;

public class PRB19 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int num = kboard.nextInt();
		for(int i = 0; i < num; i++) {
			
			int a = kboard.nextInt();
			int b = kboard.nextInt();
			int c = kboard.nextInt();
			
			if(c>b && b>a) {
				System.out.println(0);
			}
			
			int numOfCandies = c-b+1;
			b = c-1;
			numOfCandies += b-a+1;
			a = b-1;
			
			if(numOfCandies > 0)
			System.out.println(numOfCandies);
			else
			System.out.println(-1);
		}
	}
	
}
