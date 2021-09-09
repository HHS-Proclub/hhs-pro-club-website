import java.util.Scanner;

public class PRA1 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextInt();
		long output = 1;

		for (int n = 2; n < input; n++) {
			boolean isPrimeNumber = true;
			for(int divideNBy = 2; divideNBy < n; divideNBy++) {
				if(n % divideNBy == 0){
					isPrimeNumber = false;
					break;
				}
			}

			if (isPrimeNumber) {
				output *= n;
			}
		}
		System.out.print(Long.toOctalString(output));
	}
}
