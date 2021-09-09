import java.util.ArrayDeque;
import java.util.Scanner;

public class HPI3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		ArrayDeque<String> stack = new ArrayDeque<String>(n);
		String line;
		for (int i = 0; i < n; i++) {
			line = in.nextLine();
			if (line.equals("3")) {
				System.out.println(stack.peek());
			}
			else if (line.equals("2")) {
				stack.pop();
			}
			else {
				stack.push(line.split("-")[1]);
			}
		}
	}

}
