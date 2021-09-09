import java.util.Scanner;

public class PRA5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i = 0; i < cases; i++) {
			String str = sc.next();
			int consonants = 0;
			char letter = ' ';
			char secondL = ' ';
			for(int a = 0; a < str.length(); a++) {
				if(str.charAt(a) != 'a' && str.charAt(a) != 'e' && str.charAt(a) != 'i' && str.charAt(a) != 'o' && str.charAt(a) != 'u' && str.charAt(a) != 'y') {
					consonants++;
					if(consonants == 1) {
						letter = str.charAt(a);
					}else if(consonants == 2) {
						secondL = str.charAt(a); 
					}else if(consonants == 3) {
						if(letter == secondL && letter == str.charAt(a)) {
							consonants = 2;
						}
					}
				}else {
					consonants = 0;
				}
				if(consonants == 3) {
					str = str.substring(0, a) + ' ' + str.substring(a);
					consonants = 0;
				}
			}
			System.out.println(str);
		}
	}
}
