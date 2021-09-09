import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		String numOnums = Kboard.nextLine();
		int numOfnums = Integer.parseInt(numOnums);
		String[] answers = new String[numOfnums];
		for(int i = 0; i < numOfnums; i++) {
			String input = Kboard.nextLine();
			String put = input.substring(2);
			String beginningPart = input.charAt(0)+"" + input.charAt(1);
			if (beginningPart.charAt(1) == 'b') {
				put = "b" + put;
			}
			if (beginningPart.charAt(0) == 'a') {
				put = "a" + put;
			}
			answers[i] = put;
		}
		for(int i = 0; i < numOfnums; i++) {
			System.out.println(answers[i]);
		}
	}
	
}
