import java.util.Scanner;


public class PRB3 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		int total = 0;
		for (int i = 0; i < n; i++)
			total += Integer.parseInt(kboard.nextLine());
		System.out.println(total/n);
	}

}
