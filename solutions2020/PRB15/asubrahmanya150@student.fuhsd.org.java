
import java.util.Scanner;

public class PRB15 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int questions = in.nextInt();
		int guessed = in.nextInt();
		int actual = in.nextInt();
		int score = 0;
		if(guessed < actual){
			score+= guessed;
			score+= questions - actual;
		}
		else{
			score+= actual;
			score += questions - guessed;
		}
		System.out.println(score);
	}
}
