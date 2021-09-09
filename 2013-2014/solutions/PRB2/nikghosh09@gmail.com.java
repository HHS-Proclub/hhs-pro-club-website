import java.util.Scanner;

public class PRB2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		String dunks = in.nextLine();
		
		int score = 0;
		
		for(int i = 0; i < N; i++) {
			score += Character.getNumericValue(dunks.charAt(i));
		}
		
		System.out.println(score);
	}

}
