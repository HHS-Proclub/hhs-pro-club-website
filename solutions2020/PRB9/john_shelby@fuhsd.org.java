import java.util.HashMap;
import java.util.Scanner;

public class PRB9 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < cases; i++) {
			long cost = 0;
			
			long n2 = Long.parseLong(scan.nextLine());
			long k = Long.parseLong(scan.nextLine());
			long A = Long.parseLong(scan.nextLine());
			long B = Long.parseLong(scan.nextLine());

			//costs = new HashMap<Long,Long>();
			
			long n = n2;
			
			
			while (n > 1) {
				if (n % k == 0) {

					n /= k;
					cost += B;
				} else {
					n--;
					cost += A;
				}
			}
			
			System.out.println(cost);
			//System.out.println(surelyNotTheBestWay(n2,k,A,B));

		}

	}
	
	private static HashMap<Long, Long> costs;
	

	public static long surelyNotTheBestWay(long n, long k, long A, long B) {

		if (n == 1)
			return 0;
		if (n % k == 0) {
			
			long cost2 = surelyNotTheBestWay(n-1,k,A,B) + A;
			
			long cost1 = 0;
			
			while (n % k == 0) {
				n /= k;
				cost1 += B;
			}
			
			cost1 = cost1 + surelyNotTheBestWay(n,k,A,B);
			
			
			return Math.min(cost1, cost2);
		} else {
			return surelyNotTheBestWay(n-1,k,A,B) + A;
		}

	}

}
