import java.util.Scanner;

public class PRA1 {
	public static void main(String args[]) {
		int n;
		int status = 1;
		int num = 3;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		long product = 1;
		if (n >= 2){
			product = 2;
		}
		
		
		for (int i = 2; i < n; i++) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
				}
			}
			if (status != 0) {
				product *= num;
			}
			status = 1;
			num++;
		}
		
		System.out.println(Long.toString(product, 8));
	}
}
