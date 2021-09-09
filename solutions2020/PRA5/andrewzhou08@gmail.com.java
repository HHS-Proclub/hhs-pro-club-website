import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.nextLine());
		int a = Integer.parseInt(kb.nextLine());
		int b = Integer.parseInt(kb.nextLine());
		
		int out = 0;
		
		
		
		int altitude = 0;
		int numSteps = 0;
		for(int i = 1; i < n; i++) {
			if((n-i)*b > altitude + a) {
				altitude = altitude + a;
			} else {
				numSteps = i-1;
				break;
			}
		}
		
		if(altitude < (n-numSteps-1)*b) {
			altitude = (n-numSteps-1)*b;
		}
		//altitude = (n-numSteps)*b;
		
		
		
		System.out.println(altitude);
	}
}
