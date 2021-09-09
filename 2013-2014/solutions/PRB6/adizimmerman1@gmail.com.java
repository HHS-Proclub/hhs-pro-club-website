import java.util.Scanner;

public class PRB6 {
	
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		String letter = thing.nextLine();
		String text = thing.nextLine();
		
		int num = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == letter.charAt(0)) {
				num++;
			}
 		}
		System.out.println(num);
	}

}
