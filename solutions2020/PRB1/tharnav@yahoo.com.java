import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		int[] answers = new int[n];
		for(int i = 0; i < n; i++) {
			int duh = m.nextInt();
			int counter = 1;
			while(counter*(counter+1)/2 <= duh) {
				counter++;
			}
			answers[i] = counter - 1;
		}
		for(int i = 0; i < answers.length; i++) {
			System.out.println(answers[i]);
		}
	}
}
