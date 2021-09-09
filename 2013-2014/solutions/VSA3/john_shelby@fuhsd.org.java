import java.util.Scanner;


public class VSA3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String original = kboard.nextLine();
		String encrypted = kboard.nextLine();
		int len = original.length();
		
		for (int k = 1; k < Integer.MAX_VALUE; k++) {
			int i = 0;
			for (; i < len; i++) {
				char thisOne = original.charAt(i);
				char testOne = (char)(Math.pow((thisOne-65),k)%26+65);
				if (encrypted.charAt(i) != testOne)
					break;
			}
			if (i == len) {
				System.out.println(k);
				break;
			}
		}
		

	}

}
