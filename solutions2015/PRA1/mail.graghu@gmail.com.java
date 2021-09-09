import java.util.Scanner;
public class PRA1 {

	public static boolean isPrime(int number) {
	    //check if number is 2, the odd even prime
	    if (Math.abs(number) == 2)
	        return true;
	    //check if number is a multiple of 2
	    if (number % 2 == 0)
	        return false;
	    //if not, then just check the odds
	    for (int i = 3; i * i <= number; i += 2) {
	        if (number % i == 0)
	            return false;
	    }
	    return true;
	} // isPrime()

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long sol;
		if (x >= 1) {
			sol = 1;
		}
		else {
			sol = 0;
		}
		
		for (int i = 0; i < x; i++) {
			if (PRA1.isPrime(i)) {
				sol *= i;
			}
		}
		
		System.out.println(Long.toString(sol, 8));
	}

}
