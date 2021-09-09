import java.util.Scanner;

public class PRB6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] line = new int[n];
		for(int i = 0; i < line.length; i++) {
			line[i] = sc.nextInt();
		}
		
		boolean done = false;
		int temp = 0;
		int winner = -1;
		int timesWon = 0;
		while (!done) {
			for(int a = 0; a < line.length; a++) {
				System.out.print(line[a]);
			}
			System.out.println();
			if(line[0] > line[1]) {
				if(winner == -1) {
					winner = line[0];
				}
				temp = line[1];
				for (int i = 1; i < line.length-1; i++) {                
				    line[i] = line[i+1];
				}
				line[line.length-1] = temp;
			}else {
				if(winner == 0) {
					winner = line[1];
				}
				temp = line[0];
				for (int i = 0; i < line.length-1; i++) {                
				    line[i] = line[i+1];
				}
				line[line.length-1] = temp;
			}
			System.out.println(winner+" "+line[0]);
			if(winner == line[0]) {
				timesWon++;
			}else if(winner != line[0]) {
				timesWon = 1;
			}
			if(timesWon == k) {
				done = true;
			}
			winner = line[0];
			//System.out.println(timesWon);
		}
		System.out.println(line[0]);
	}
}