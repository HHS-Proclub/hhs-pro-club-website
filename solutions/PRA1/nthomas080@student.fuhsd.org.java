import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		long[] gcds = new long[num];
		
		for (int i = 0; i < num; i ++) {
			
			long val = sc.nextLong();
			String valS = val + "";
			long sum = 0;
			for (int k = 0; k < valS.length(); k ++) {
				
				sum += Integer.parseInt(valS.substring(k, k + 1));
				
			}
			
			while (gcd(val, sum) == 1) {
				
				val++;
				sum = 0;
				valS = val + "";
				for (int k = 0; k < valS.length(); k ++) {
					
					sum += Integer.parseInt(valS.substring(k, k + 1));
					
				}
				
			}
			
			gcds[i] = val;
			
		}
		
		for (long x : gcds) {
			
			System.out.println(x);
			
		}
		
		sc.close();

	}
	
	public static long gcd(long u, long v) {

	    if (u == v)
	        return u;
	    
	    if (u == 0)
	        return v;
	    if (v == 0)
	        return u;

	    if (u % 2 == 0) {
	        if (v % 2 == 1) 
	            return gcd(u/2, v);
	        else
	            return 2 * gcd(u/2, v/2);

	    } else {
	        if (v % 2 == 0)
	            return gcd(u, v/2);

	        
	        if (u > v)
	            return gcd((u - v)/2, v);
	        else
	            return gcd((v - u)/2, u);
	    }
		
	}

}
