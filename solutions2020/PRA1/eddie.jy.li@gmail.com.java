import java.util.Scanner;

public class PRA1 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numLines = Integer.parseInt(input.nextLine());
		
		
		for (int i = 0; i < numLines; i++) {
			String line = input.nextLine();
			test(line);
		}
		
	}
	
	public static boolean test(String line) {
		
		if (line.charAt(0) != '1') {
			System.out.println("NO");
			return false;
		} else {
			int disFromLastOne = 0;
			for (int index = 1; index < line.length(); index++) {
				if (line.charAt(index) == '1') {
					disFromLastOne = 0;
				} else if (line.charAt(index) == '4') {
					disFromLastOne++;
				} else  {
					System.out.println("NO");
					return false;
				}
			}
			if (disFromLastOne >= 3) {
				System.out.println("NO");
				return false;
			}
		}
		System.out.println("YES");
		return true;
	}

}
