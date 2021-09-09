import java.util.Scanner;

public class HPI2 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int[] lockers = new int[in.nextInt()];
		
		for (int i = 2; i <= lockers.length; i++) {
			
			for (int j = i-1; j < lockers.length; j++) {
				if ((j+1) % i == 0) {
					if (lockers[j] == 0) {
						lockers[j]++;
					} else {
						lockers[j]--;
					}
				}
			}
		}
		
		int openLockers = 0;
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i] == 0) {
				openLockers++;
			}
		}
		System.out.println(openLockers);
	}
}
