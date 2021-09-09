import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeats = input.nextInt();
		for(int x = 0; x < repeats; x++) {
			long n = input.nextInt();
			long k = input.nextInt();
			long A = input.nextInt();
			long B = input.nextInt();
			long coins = findCost(n,k,A,B,0);
			System.out.println(coins);
		}
		input.close();
	}

	public static long findCost(long n, long k, long A, long B, long cost) {
		if(n <= 1) {
			return cost;
		}
		
		long n1 = -1;
		
		if(k > 1 && n % k == 0) {
			n1 = findCost(n/k,k,A,B,cost + B);
		}
		
		long n2 = findCost(n-1,k,A,B,cost + A);
		
		if(n1 != -1 && n1 < n2) {
			return n1;
		} else {
			return n2;
		}
	}
}
