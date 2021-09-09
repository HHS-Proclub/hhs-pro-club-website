import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int probs = s.nextInt();
		for (int i = 0; i < probs; i++) {
			long a = s.nextLong();
			long b = s.nextLong();
			System.out.println(a*b);
		}
	}

}
