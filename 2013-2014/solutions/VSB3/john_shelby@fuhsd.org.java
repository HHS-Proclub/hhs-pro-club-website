import java.util.Scanner;


public class VSB3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String[] line = kboard.nextLine().split(" ");
		int h = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		System.out.print((h > 12 || h == 0 ? Math.abs(h-12) : h) + " " + m + " " + (h >= 12? "PM" : "AM"));
	}

}
