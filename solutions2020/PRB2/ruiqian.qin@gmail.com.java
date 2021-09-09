import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int totalscore = 0;
		for(int i =0; i<5; i++){
		int score = kboard.nextInt();		
		totalscore=totalscore+score;
		
		}
	
		System.out.println(totalscore);
	}

}
