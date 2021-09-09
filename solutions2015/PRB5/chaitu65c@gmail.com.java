import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		String s = k.next();
		char[] alpha = new char[26];
		int[] count = new int[26];
		for (int i = 0; i < 26; i++) {
			alpha[i] = (char) ('a' + i);
		}
		for (int i = 0; i < s.length(); i++) {
			for (int g = 0; g < 26; g++) {
				if(alpha[g] == s.charAt(i)){
					count[g]++;
				}
			}
		}
		for(int i = 0 ; i < 26; i++){
			if(count[i] != 0){
				System.out.println(alpha[i] + " " + count[i]);
			}
		}
	}
}
