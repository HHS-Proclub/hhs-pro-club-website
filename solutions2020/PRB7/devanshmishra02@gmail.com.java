import java.util.Scanner;

public class PRB7 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long x = input.nextLong();
        for(int i = 0; i < x; i++) {
        	long n = input.nextLong();
        	long best = -1;
        	for(long k = 1; k < n; k++) {
        		long divisor1 = (long) (Math.pow(2, k) - 1);
        		long divisor2 = (long)(Math.pow(2, k-1));
        		long divisor = divisor1*divisor2;
        		if(divisor != 0 && n % divisor == 0 && divisor > best) {
        			best = divisor;
        		}
        		
        	}
        	System.out.println(best);
        	
        }
//        
        input.close();
        
	}
}
