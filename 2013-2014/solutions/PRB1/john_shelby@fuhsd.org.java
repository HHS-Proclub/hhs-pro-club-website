import java.util.Scanner;


public class PRB1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n = Integer.parseInt(k.nextLine());
		long total = 0;
		for (int i = 0; i < n; i++) {
			total += Integer.parseInt(k.nextLine());
		}
		System.out.println(total/n);

	}

}
