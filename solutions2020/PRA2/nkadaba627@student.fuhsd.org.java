import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ns = new int[n];
		for(int i = 0;i<ns.length;i++) {
			ns[i] = s.nextInt();
		}
		for(int i = 0;i<ns.length;i++) {
			if(ns[i]==Integer.parseInt(new StringBuilder(ns[i]+"").reverse().toString())){
				System.out.println("NO");
			}else
			System.out.println((isPrime(ns[i])&&isPrime(Integer.parseInt(new StringBuilder(ns[i]+"").reverse().toString())))?"YES":"NO");
		}
	}

	static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
