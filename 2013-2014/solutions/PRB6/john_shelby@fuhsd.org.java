import java.util.Scanner;


public class PRB6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c = s.nextLine().charAt(0);
		System.out.println(s.nextLine().replaceAll("[^"+c+"]", "").length());

	}

}
