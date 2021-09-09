import java.math.BigInteger;
import java.util.Scanner;

public class PRA1 {
	public static void main(String[] Args){
//		long bi = 1;
//		int x = new Scanner(System.in).nextInt();
//		for(int i = 2; i <= x; i++)
//			if(isPrime(i))
//				bi *= i;
//		
//		System.out.println(Long.toString(bi, 8));
				
	}

	private static boolean isPrime(int toCheck) {
		int x = (int)Math.sqrt(toCheck);
		if(toCheck == 2) return true;
		if(toCheck % 2 == 0) return false;
		for(int i = 3; i <= x; i += 2)
			if(toCheck % i == 0)
				return false;
		return true;
	}
}
