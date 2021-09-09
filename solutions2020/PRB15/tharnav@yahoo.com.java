import java.util.Scanner;

public class PRB15 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int questions = kboard.nextInt();
		int trues = kboard.nextInt();
		int actual = kboard.nextInt();
		
		if(trues>actual) {
			System.out.println((trues-actual)+(questions-trues));
		} else if (trues<actual) {
			System.out.println(actual+(questions-trues));
		} else {
			System.out.println(questions);
		}
	}
}
