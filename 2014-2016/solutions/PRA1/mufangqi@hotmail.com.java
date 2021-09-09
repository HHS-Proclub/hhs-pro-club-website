import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 {
	static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String args[]){
		ArrayList<Integer> prime = new ArrayList<Integer>(){};
		Scanner s = new Scanner(System.in);
		long product = 1;
		int input = s.nextInt();
		
		for(int i =1; i < input; i++){
			if(isPrime(i))
				prime.add(i);
		}
		
		for(int i : prime){
			if(i < input)
				product *= i;
		}
		System.out.println(Long.toString(product, 8));
		
	}
}
