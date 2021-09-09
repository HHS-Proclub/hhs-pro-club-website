
import java.util.Scanner;

public class PRA16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b = Integer.parseInt(in.next());
		for(int i = 1; i < 301; i++) {
			if(isPal(Integer.toString(i*i, b))) {
				System.out.println(Integer.toString(i, b)+ " " + Integer.toString(i*i, b));
			}
			
		}
		
		in.close();
	}
	public static boolean isPal(String in) {
		int length = in.length();
		for (int i = 0; i < length/2; i++) {
			char c1 = in.charAt(i);
			char c2 = in.charAt(length-1-i);
			if (c1 != c2) {
				return false;
			}
		}
		return true;		
	}
}

