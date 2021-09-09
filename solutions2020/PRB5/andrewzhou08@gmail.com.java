import java.util.ArrayList;
import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String in = kb.nextLine();
		String in2 = kb.nextLine();
		
		String[] inSplit = in.split(" ");
		String[] in2Split = in2.split(" ");
		
		int[] int1 = new int[inSplit.length];
		int[] int2 = new int[in2Split.length];
		
		
		int max1 = 0;
		for(int i = 0; i < inSplit.length; i++) {
			int1[i] = Integer.parseInt(inSplit[i]);
			if(int1[i] > max1) {
				max1 = int1[i];
			}
		}
		
		int max2 = 0;
		for(int i = 0; i < in2Split.length; i++) {
			int2[i] = Integer.parseInt(in2Split[i]);
			if(int2[i] > max2) {
				max2 = int2[i];
			}
		}
		
		
		System.out.println(max1 + max2);
	}

	public static boolean isDivisible(int a, int b) {
		if(a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
}
