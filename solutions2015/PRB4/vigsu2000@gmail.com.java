import java.math.BigInteger;
import java.util.Scanner;

public class PRB4 {
	
	public static long factorialOfBruises(int[] i) {
		long sum = 0;
		long output = 1;
		for(int a = 0; a < i.length; a++) {
			sum += i[a];
		}
		for(long b = sum; b > 1; b--) {
			output = output * b;
		}
		return output;
	}
	
	public static void main(String[] args) {
		try{
		int[] arr = new int[4];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(factorialOfBruises(arr));
		}catch(Exception e)
		{
			System.out.println(0);
		}
	}

}
