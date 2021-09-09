import java.util.Scanner;


public class PRB4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Object() { public boolean t(String a) { return a.length() <= 1 || a.charAt(0) == a.charAt(a.length()-1) && t(a.substring(1, a.length()-1)); } }.t(new Scanner(System.in).nextLine()));
	}

}
