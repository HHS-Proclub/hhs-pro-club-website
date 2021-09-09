import java.util.Scanner;

public class PRB8 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int h = Integer.parseInt(kboard.nextLine());
		h *= 2;
		double temp = h / 10.0;
		temp = Math.sqrt(temp);
		System.out.println(Math.round(temp));
	}
}
