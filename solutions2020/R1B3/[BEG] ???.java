import java.util.Scanner;

public class R1B3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int sum = 0;
		for(int i= 0; i<n; i++){
			if(isPrime(i)) sum+= i;
		}
		
		System.out.println(sum);
	}
	
	private static boolean isPrime(int n) {
		boolean isPrime;
		
			if (n <= 1)
				isPrime = false;
			else if (n <= 3)
				isPrime = true;
			else if (n % 2 == 0 || n % 3 == 0)
				isPrime = false;
			else {
				int i = 5;
				while (i * i <= n) 
					if (n % i == 0 || n % (i + 2) == 0)
						isPrime = false;
				i = i + 6;
				isPrime = true;
			}
		return isPrime;
	}

}
