import java.util.Scanner;

public class PRA12 {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			String s = kboard.nextLine();
			while (s.length() != 0) {
				boolean found = false;
				for (int j = 0; j < s.length() - 1; j++) {
					if (s.charAt(j) == s.charAt(j + 1)) {
						s = s.substring(0, j) + s.substring(j + 2);
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("Impossible");
					break;
				}
			}
			if (s.length() == 0) {
				System.out.println("Possible");
			}
		}
	}
}
