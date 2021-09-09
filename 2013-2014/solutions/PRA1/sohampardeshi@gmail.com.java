import java.util.*;
public class PRA1 {
	public static void main(String[]Args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		int n = Integer.parseInt(num);
		String sent = scanner.nextLine();
		int start;
		String answer = "";

		for(start = 1; start <= sent.length(); start++){
			char nLetter = (char) ((sent.charAt(start - 1)));

			if (nLetter >= 97 && nLetter <= 122){
				int x = (nLetter - 97 + n) %26 + 97;

				if (x < 0) 
					x = (((x % 26) + 26 ) % 26); 
				char nLetter1 = (char) (x);
				answer = answer + nLetter1;
			}
			else{
				answer = answer + nLetter;
			}


		}
		System.out.println(answer);
	}

}



