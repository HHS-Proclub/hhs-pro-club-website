import java.util.Scanner;

public class PRA6 {

	public static String canSay(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 'p' && s.charAt(i) != 'k' && s.charAt(i) != 'c') {
				return "NO";
			}
			else {
				if(s.charAt(i) == 'p') {
					if(s.charAt(i+1) != 'i') {
						return "NO";
					}
					else {
						i++;
					}
				}
				else if(s.charAt(i) == 'k') {
					if(s.charAt(i+1) != 'a') {
						return "NO";
					}
					else {
						i++;
					}
				}
				else if(s.charAt(i) == 'c') {
					if(s.charAt(i+1) != 'h' || s.charAt(i+2) != 'u') {
						return "NO";
					}
					else {
						i += 2;
					}
				}
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] answers = new String[n];
		for(int i = 0; i < n; i++) {	
			String s = scan.nextLine();
			answers[i] = canSay(s);
		}
		for(int j = 0; j < answers.length; j++) {
			System.out.println(answers[j]);
		}
	}
}
