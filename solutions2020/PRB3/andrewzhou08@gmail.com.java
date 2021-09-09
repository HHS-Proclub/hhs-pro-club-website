import java.util.ArrayList;
import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int in = kb.nextInt();
		int in2[] = new int[in];
		for(int i = 0; i < in; i++) {
			in2[i] = kb.nextInt();
		}
		
		
		
		ArrayList<Integer> out2 = new ArrayList<Integer>();
		
		for(int i : in2) {
			for(int j = 1; j <= i; j++) {
				if(isDivisible(i, j)) {
					out2.add(j);
				}
			}
		}
		
		
		
		for(int i : out2) {
			System.out.println(i);
		}
	}
	
	public static boolean isDivisible(int a, int b) {
		if(a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
}
