import java.util.Scanner;


public class PRB13 {

	public static void main (String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		String word = kb.next();
		
		for (int i = 0; i < word.length(); i++) {

			if ((word.charAt(i) + "")
					.equals((word.charAt(word.length() - i - 1)) + "")) {

			} else {

				System.out.println("false");
			}

		}

		System.out.println("true");
		
		kb.close();
		
	}
		
}
