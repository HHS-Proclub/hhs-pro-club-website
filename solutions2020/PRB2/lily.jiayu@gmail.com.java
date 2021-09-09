import java.util.Scanner;

public class PRB2 {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scoreOne = scan.nextInt();
		int scoreTwo = scan.nextInt();
		int scoreThree = scan.nextInt();
		int scoreFour = scan.nextInt();
		int scoreFive = scan.nextInt();
		int total = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive;
		System.out.println(total);
	}
}
