import java.util.ArrayList;
import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int in = kb.nextInt();
		int in2 = kb.nextInt();


		
		int[] out = new int[in2];
		for(int i = 1; i <= in2; i++) {
			out[i-1] = in * i;
		}
		


		for(int i = 0; i < in2; i++){
			System.out.println(out[i]);
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
