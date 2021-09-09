import java.util.Scanner;
public class PRB15 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int total = s.nextInt();
		int guessedT = s.nextInt();
		int actualT = s.nextInt();
		int guessedF = total - guessedT;
		int actualF = total - actualT;
		int correct = 0;
		if(guessedT < actualT){
			correct += guessedT;
		} else {
			correct += actualT;
		}
		if(guessedF < actualF){
		
			correct += guessedF;
		} else {
			correct += actualF;
		}
		System.out.println(correct);
	}

}
