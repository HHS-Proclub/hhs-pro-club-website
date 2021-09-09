import java.util.Scanner;

public class PRA6 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i <n; i++) {
			String temp = kboard.nextLine();
			int current = 0;
			boolean good = true;
			while (good && current < temp.length()) {
				if (temp.charAt(current) == 'p') {
					if (current + 1 < temp.length()) {
						if (temp.charAt(current + 1) != 'i') {
							good = false;
						}
					} else {
						good = false;
					}
					current += 2;
				} else if (temp.charAt(current) == 'k') {
					if (current + 1 < temp.length()) {
						if (temp.charAt(current + 1) != 'a') {
							good = false;
						}
					} else {
						good = false;
					}
					current += 2;
				} else if (temp.charAt(current) == 'c'){
					if (current + 2 < temp.length()) {
						if (temp.charAt(current + 1) != 'h' || temp.charAt(current + 2) != 'u') {
							good = false;
						}
					} else {
						good = false;
					}
					current += 3;
				} else {
					good = false;
				}
			}
			if (good) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
