import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String start = s.next();
		
		int[] c = new int[26];
		
		for (int x = 0; x < start.length(); x++) {
			c[(int) start.charAt(x) - 97] += 1; 
		}
				
		for (int x = 0; x < c.length; x++) {
			if (c[x] != 0) {
				System.out.println((char)(x + 97) + " " + c[x]);
			}
		}
	}

}
