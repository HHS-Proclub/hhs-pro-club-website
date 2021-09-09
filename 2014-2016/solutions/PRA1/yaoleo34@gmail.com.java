import java.math.BigInteger;
import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		long x= 1;
		
		int a = kb.nextInt();
		for(int i=a; i>0; i--){
			
			if(isPrime(i)){
				x*=i;
			}else{
				
			}
		}
		String s = Long.toOctalString(x);
		System.out.println(s);

	}
	private static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
