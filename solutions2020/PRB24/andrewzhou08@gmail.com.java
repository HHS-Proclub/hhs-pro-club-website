import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB24 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Character> chars = new ArrayList<Character>();
		char[] in = kb.nextLine().toCharArray();
		
		for(char c : in) {
			chars.add(c);
		}
		
		for(int i = chars.size() - 1; i >= 0; i--) {
			if(!Character.isDigit(chars.get(i))) {
				chars.remove(i);
			}
		}
		
		int total = 0;
		for(char c : chars) {
			total += Character.getNumericValue(c);
		}
		
		System.out.println(total);
		
		
	}
}
