import java.util.ArrayList;
import java.util.Scanner;

public class PRB7 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] in = new int[n];
		for(int i = 0; i < n; i++) {
			in[i] = kb.nextInt();
		}
		int num = kb.nextInt();
		
		int total = 0;
		for(int i = 0; i < n; i++) {
			if(in[i] == num) {
				total++;
			}
		}
		
		int out = 100*total/n;
		
		
		System.out.println(out);
	}

	public static boolean isDivisible(int a, int b) {
		if(a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
}
