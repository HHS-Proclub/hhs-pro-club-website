import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HPI2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.nextLine());
		
		boolean[] lockers = new boolean[n];
		for(int i = 0; i < lockers.length; i++) {
			lockers[i] = false;
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n; j++) {
				if(j % i == 0) {
					lockers[j] = !lockers[j];
				}
			}
		}
		
		int total = 0;
		for(boolean b : lockers) {
			if(b) total++;
		}
		
		System.out.println(total+1);
	}
}
