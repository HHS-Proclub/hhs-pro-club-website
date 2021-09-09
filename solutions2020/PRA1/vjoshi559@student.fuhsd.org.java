import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PRA1 {
	
	public static int nextYear(int n) {
		int next = n + 1;
		while(hasDistinctDigits(next) == false) {
			next++;
		}
		return next;
	}
	
	private static boolean hasDistinctDigits(int number) {
	     int numMask = 0;
	     int numDigits = (int) Math.ceil(Math.log10(number+1));
	     for (int digitIdx = 0; digitIdx < numDigits; digitIdx++) {
	         int curDigit = (int)(number / Math.pow(10,digitIdx)) % 10;
	         int digitMask = (int)Math.pow(2, curDigit);             
	         if ((numMask & digitMask) > 0) return false;
	         numMask = numMask | digitMask;
	     }
	     return true;
	 }
	
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in); 
		int numbers = kbd.nextInt();
		for (int i = 0; i < numbers; i++) {
			int a = kbd.nextInt();
			System.out.println(nextYear(a));
		}
	}
}
