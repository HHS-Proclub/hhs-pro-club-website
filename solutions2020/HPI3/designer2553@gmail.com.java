import java.util.LinkedList;
import java.util.Scanner;

public class HPI3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int commands = in.nextInt();
		in.nextLine();
		LinkedList<String> books = new LinkedList<> ();
		
		for (int i = 0; i < commands; i++) {
			String command = in.nextLine();
			
			if (command.startsWith("1")) {
				String book = command.substring(2);
				books.add(book);
			} else if (command.startsWith("2")) {
				books.removeLast();
			} else {
				System.out.println(books.getLast());
			}
		}
	}

}
