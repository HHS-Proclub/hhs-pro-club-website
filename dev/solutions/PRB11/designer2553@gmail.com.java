import java.util.Scanner;

public class PRB11 {

	public static void main (String[] args) {
		Scanner kboard = new Scanner(System.in);
		int answers = kboard.nextInt();
		String[][] array = new String[2][answers];
		
		for (int r = 0; r < array.length; r++) {
			
			for (int c = 0; c < array[r].length; c++) {
				array[r][c] = kboard.next();
			}
		}
		
		int score = 0;
		
		for (int i = 0; i < answers; i++) {
			if (array[0][i].equals(array[1][i])) {
				score += 4;
			} else {
				score--;
			}
		}
		
		System.out.println(score);
		kboard.close();
	}
}
