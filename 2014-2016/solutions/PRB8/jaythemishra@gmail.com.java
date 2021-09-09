import java.util.Scanner;
public class PRB8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int space = input.indexOf(' ');
		int firstInt = Integer.parseInt(input.substring(0, space));
		int secondInt = Integer.parseInt(input.substring(space + 1));
		int i = 0;
		for (i = 0; i <= firstInt * secondInt; i++) {
			if (i % firstInt == 0 && i % secondInt == 0)
				break;
		}
		System.out.println(i);
	}
	
}
