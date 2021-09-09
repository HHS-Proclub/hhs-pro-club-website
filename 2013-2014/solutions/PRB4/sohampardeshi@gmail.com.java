import java.util.Scanner;

public class PRB4 {
	private static String word = "";
	private static String reverse = "";
	public static void main(String[]Args){
		Scanner inputReader = new Scanner(System.in);
		word = inputReader.nextLine();

		int length = word.length();

		for (int i = length - 1; i >= 0; i--){
			reverse = reverse + word.charAt(i);
		}
		if (word.equals(reverse)){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}

	}


}

