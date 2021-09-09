import java.util.Scanner;

public class PRA5 {
	
	public static void main(String[] args) {
		
		Scanner Kboard = new Scanner(System.in);
		int n = Kboard.nextInt();
		int a = Kboard.nextInt();
		int b = Kboard.nextInt();
		int altitude = 0;
		int highestPoint = 0;
		int numSteps;
		for(int i = n; i <= n*a; i++) {
			altitude = i;
			if (i % a == 0) {
				numSteps = i/a;
			} else {
			numSteps = i/a + 1;
			}
			if(altitude/a <= b*(n-numSteps)) {
				if((n-numSteps)*b >= altitude) {
					if (altitude > highestPoint) {
						highestPoint = altitude;
					}
				}
			}
		}
		System.out.println(highestPoint);
	}
	
}
