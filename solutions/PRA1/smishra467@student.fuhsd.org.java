import java.util.Scanner;

public class PRA1 {
	
	public static long gcd(long a, long b) {
		long old;
		if (a < b) {
			old = b;
			b = a;
			a = old;
		}
		long divisor, dividend, remainder, remainder_old = a, dividend_old, divisor_old, remainder_older;
		divisor = b;
		dividend = a;
		do {
			remainder = dividend % divisor;
			remainder_older = remainder_old;
			remainder_old = remainder;
			dividend_old = dividend;
			divisor_old = divisor;
			dividend = divisor_old;
			divisor = remainder_old;
		} while (remainder > 0);
		
		return remainder_older;
	}
	
	public static long digsum(long num) {
		long sum, numcopy;
		sum = 0;
		for (numcopy = num; numcopy != 0; numcopy /= 10) {
			sum += numcopy % 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		long[] arr = new long[len];
		for (int i = 0; i < len; i++) {
			long a = sc.nextLong();
			long num = a, sum;
			sum = digsum(num);
			while (gcd(num, sum) <= 1L) {
				num++;
				sum = digsum(num);
			}
			arr[i] = num;
		} 
		for (int j = 0; j < len; j++) {
			System.out.println(arr[j]);
		}
	}
	
}
