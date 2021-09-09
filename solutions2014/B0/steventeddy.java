import java.util.Scanner;
import java.util.ArrayList;

public class B0 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		Scanner kb = new Scanner(System.in);
		int lines = kb.nextInt();
		
		for (int i = 0; i <= lines; i++) {
			
			names.add(kb.nextLine());
			
		}
		
		for (int i = 0; i <= names.size() - 1; i++) {

			System.out.println(names.get(i));

		}
		
		kb.close();

	}

}
