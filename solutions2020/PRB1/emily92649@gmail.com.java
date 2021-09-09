//Sarah goes to the concert PRB1


package hhs_challenge;

import java.util.Scanner;

public class P92819_EmilyT {
	public static void main(String[] args) {
		
		Scanner kboard;
		int n;
		
		
		kboard= new Scanner(System.in);
		
		System.out.print("Number of problems: ");
		n=kboard.nextInt();
		
		
		while (n>0) {
			int x, y;
			System.out.print("M N = " );
			x=kboard.nextInt();
			y=kboard.nextInt();
			System.out.println((x*y) + " People");
			n--;
		}
		kboard.close();
	}

}



















