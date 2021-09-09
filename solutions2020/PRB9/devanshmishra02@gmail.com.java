

import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        
        for(int i = 0; i < x; i++) {
        	long n = input.nextLong();
        	long k = input.nextLong();
        	long A = input.nextLong();
        	long B = input.nextLong();
//        	System.out.println(manipulate(n, k, A, B, 0));
        	long cost = 0;
        	while(n > 1) {
        		if(k > 0 && n % k == 0 && ((n - (n/k)) * A) > B) {
        			n/=k;
        			cost+= B;
        		} else {
        			n -= 1;
        			cost+=A;
        		}
        	}
        	System.out.println(cost);
        }
        
        input.close();

	}
	
//	public static int manipulate(int n, int k, int A, int B, int cost) {
//		if(n <= 1) {
//			return cost; 
//		}
//		int x = manipulate(n - 1, k, A, B, cost+A);
//		int y = Integer.MAX_VALUE;
//		if(k != 0 && n % k == 0) {
//			y = manipulate((n/k), k, A, B, cost+B);
//		}
//		if(x < y) {
//			return x;
//		} else {
//			return y;
//		}
//	}

}
