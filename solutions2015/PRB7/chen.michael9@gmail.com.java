import java.util.Scanner;

public class PRB7 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String s = kboard.nextLine();
		kboard.close();
		int count = 0;
		String[] strings = s.split(",");
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].trim();
		}
		for (int i = 0; i < strings.length - 1; i++) {
			int temp = 0;
			while (i < strings.length - 1 && strings[i].equals(strings[i + 1])) {
				i++;
				temp++;
			}
			if (temp > 0) {
				count++;
			}
		}
		System.out.println(count);
	};
}
	