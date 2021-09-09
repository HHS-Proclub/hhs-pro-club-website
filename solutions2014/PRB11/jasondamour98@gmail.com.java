import java.util.Scanner;


public class PRB11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numQs = input.nextInt();
		input.nextLine();
		String answers = input.nextLine();
		String answerKey = input.nextLine();
		int score =0;
		
		for(int i=0; i<answers.length(); i+=2){
			String test1 = ""+answers.charAt(i);
			String test2  = ""+answerKey.charAt(i);
			
			if(test1.equalsIgnoreCase(test2)){
				score += 4;
			}
			else{
				score--;
			}
		}
		System.out.println(score);
	}

}
