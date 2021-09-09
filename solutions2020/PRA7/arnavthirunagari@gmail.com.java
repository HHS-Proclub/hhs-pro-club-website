import java.util.Scanner;

public class PRA7 {
	public static void main(String args[]) {
		int[] letters = new int[26];
		int total = 0;
		boolean bool = false;
		for (int i = 0; i < 26; i++) {
			letters[i] = 0;
		}
		Scanner Kboard = new Scanner(System.in);
		String word = Kboard.next();
		Scanner reader = new Scanner(word);
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int num = ((int) ch) - 65;
			letters[num]++;
		}
		
		for (int i = 0; i<25; i++) {
			if(letters[i] % 2 == 1) {
				if (bool == false) {
					bool = true;
					total++;
				}
			}
			total = total + letters[i]/2;
		}
		if(word.length() == total) {
			total = total - 1;
		}
		if (bool == true) {
		System.out.println(total+total-1);
		} else {
			System.out.println(2*total);
		}
	}
}
