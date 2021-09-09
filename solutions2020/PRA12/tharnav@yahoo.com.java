import java.util.Scanner;

public class PRA12 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		int tests = Kboard.nextInt();
		String garb = Kboard.nextLine();
		String[] answers = new String[tests];
		for(int i = 0; i < tests; i++) {
			String word = Kboard.nextLine();
			boolean bool = true;
			while(word != "" && bool == true) {
				bool = false;
				for(int j = 0; j < word.length()-1; j++) {
					if(word.length()!=2) {					if(word.charAt(j) == word.charAt(j+1)) {
						if (j != 0) {
							word = word.substring(0, j) + word.substring(j+2);
						} else {
							word = word.substring(j+2);
						}
						bool = true;
					} 
					} else {
						if(word.charAt(0) != word.charAt(1)) {
							bool = false;
							word = "";
						} else {
							bool = true;
							word = "";
						}
					}
				}
			}
			if (bool == true) {
				answers[i] = "Possible";
			} else {
				answers[i] = "Impossible";
			}
		}
		for(int i = 0; i < tests; i++) {
			System.out.println(answers[i]);
		}
	}
}
