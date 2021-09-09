import java.util.Scanner;

public class PRA6 {
	public static void main(String args[]) {
		Scanner Kboard = new Scanner(System.in);
		int q = Kboard.nextInt();
		String[] words = new String[q];
		for(int i = 0; i <= q-1; i++) {
			words[i] = Kboard.next();
		}
		boolean[] answer = new boolean[q];
		for(int i = 0; i <= q-1; i++) {
			answer[i] = false;
			int position = 0;
			while (true) {
				char c = words[i].charAt(position);
				if (c == 'p') {
					if (position >= words[i].length()-1) {
						answer[i] = false;
						break;
					}
					if (words[i].charAt(position+1) == 'i') {
						position = position + 2;
					}else {
						answer[i] = false;
						break;
					}
				}
				else if (c == 'k') {
					if (position >= words[i].length()-1) {
						answer[i] = false;
						break;
					}
					if (words[i].charAt(position+1) == 'a') {
						position = position + 2;
					}else {
						answer[i] = false;
						break;
					}
				}
				else if (c == 'c') {
					if (position >= words[i].length()-2) {
						answer[i] = false;
						break;
					}
					if (words[i].charAt(position+1) == 'h') {
						if (words[i].charAt(position+2) == 'u') {
							position = position + 3;
						}else {
							answer[i] = false;
							break;
						}
					} else {
						answer[i] = false;
						break;
					}
				} else {
					answer[i] = false;
					break;
				}
				if (position == words[i].length()) {
					answer[i] = true;
					break;
				}
			}
			if (answer[i] == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}

}
