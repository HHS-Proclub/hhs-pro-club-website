import java.util.Scanner;


public class PRB6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		String letter = inputReader.nextLine();
		String text = inputReader.nextLine();
		
		System.out.println(checkString(letter, text));
	}

	private static int checkString(String letter, String text) {
		int count = 0;
		for(int i = 0; i < text.length(); i++){
			char checkLetter = text.charAt(i);
			char l1 = letter.charAt(0);
			if(checkLetter == l1){
				count++;
			}
		}
		return count;
		
	}

}
