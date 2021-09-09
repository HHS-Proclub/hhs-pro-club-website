import java.util.*;

public class PRB6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		char key = scan.nextLine().charAt(0);
	
		String phrase = scan.nextLine();
		
		int count = 0;
		for(int i = 0; i < phrase.length(); i++) {
			if(phrase.charAt(i) == key) count++;
		}
		
		System.out.println(count);
		
	}
}
