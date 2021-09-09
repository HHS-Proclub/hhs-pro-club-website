import java.util.Scanner;

public class PRB1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] answers = new int[n];
		for(int i = 0; i < n; i++) {
			int one = s.nextInt();
			int two = s.nextInt();
			answers[i] = one+two;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(answers[i]);
		}
	}
}
