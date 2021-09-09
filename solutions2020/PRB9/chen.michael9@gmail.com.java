import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			String str = kboard.nextLine();
			String temp = str.substring(2);
			if (str.charAt(0) == 'a') {
				temp = "a" + temp;
			} 
			if (str.charAt(1) == 'b') {
				if (str.charAt(0) != 'a') {
					temp = "b" + temp;
				} else {
					temp = temp.charAt(0) + "b" + temp.substring(1);
				}
			}
			System.out.println(temp);
		}
	}
}
