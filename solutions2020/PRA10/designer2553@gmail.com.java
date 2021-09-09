
import java.util.Scanner;

public class PRA10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int min = in.nextInt();
			int max = in.nextInt();
			int palPrimeCount = 0;
			
			NumGen: for (int j = min; j <= max; j++) {
				int divisor = 2;
				
				if (j <= 1) {
					continue;
				}
				
				// Verifications
				while (divisor <= Math.sqrt(j)) {
					if (j % divisor == 0) {
						continue NumGen;
					} else {
						divisor++;
					}
				}
				
				String jStr = String.valueOf(j);
				for (int a = 0, b = jStr.length()-1; a < b; a++, b--) {
					if (jStr.charAt(a) != jStr.charAt(b)) {
						continue NumGen;
					}
				}
				
				palPrimeCount++;
			}
			
			System.out.println(palPrimeCount);
		}
	}

}
