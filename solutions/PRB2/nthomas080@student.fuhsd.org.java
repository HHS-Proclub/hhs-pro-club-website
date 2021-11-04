import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.nextLine();

		String[] answers = new String[num];

		for (int i = 0; i < num; i++) {

			if (numVowels(sc.nextLine()) != 5) {

				answers[i] = "False";
				
			}
			
			if (numVowels(sc.nextLine()) != 7) {

				answers[i] = "False";
				
			}
			
			if (numVowels(sc.nextLine()) != 5) {

				answers[i] = "False";
				
			}

		}
		
		for (String s : answers) {
			
			System.out.println(s==null?"YES":"NO");
			
		}

	}

	public static int numVowels(String s) {

		int count = 0;
		
		s = s.trim();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				count++;

			}

		}

		return count;

	}

}
