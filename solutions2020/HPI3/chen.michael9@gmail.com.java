import java.util.Scanner;
import java.util.Stack;

public class HPI3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < n; i++) {
			String command = kboard.nextLine();
			if (command.charAt(0) == '1') {
				stack.add(command.substring(2));
			} else if (command.charAt(0) == '2') {
				stack.pop();
			} else if (command.charAt(0) == '3') {
				System.out.println(stack.peek());
			}
		}
	}
}
