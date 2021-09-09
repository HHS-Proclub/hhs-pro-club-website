import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA8 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.nextLine());
		int[] in = new int[n];
		for(int i = 0; i < n; i++) {
			in[i] = Integer.parseInt(kb.nextLine());
		}
		
		
		
		for(int i = 0; i < n; i++) {
			System.out.println(Math.abs(in[i] - findClosestFibonacci(in[i])));
		}
	}
	
	public static int findClosestFibonacci(int n) {
		
		int k = 0;
		if(n == 0 || n == 1 || n == 2 || n == 3) {
			return n;
		}
		for(int i = 0; i < n; i++) {
			if(fib(i) <= n && fib(i+1) >= n) {
				k = i;
				break;
			}
		}
		if(Math.abs(fib(k)-n) > Math.abs(fib(k+1)-n)) {
			return fib(k+1);
		} else {
			return fib(k);
		}
	}
	
	private static int fib(int n) {
        int a = 0;
        int b = 1;
 
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = a + b;
            b = temp;
        }
        return a;
    }
}
