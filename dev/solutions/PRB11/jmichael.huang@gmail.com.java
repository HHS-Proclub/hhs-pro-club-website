import java.util.Scanner;


public class PRB11 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		int total = Integer.parseInt(num);
		
		char[] answerKey = new char[total];
		char[] studentInput = new char[total];
		
		String answer = in.nextLine();
		for(int i = 0; i < total; i++)
			answerKey[i] = answer.charAt(0 + 2*i);
		String answer2 = in.nextLine();
		for(int j = 0; j < total; j++)
			studentInput[j] = answer2.charAt(0 + 2*j);
		
		int score = 0;
		for(int k = 0; k < total; k++)
		{
			if(answerKey[k] == studentInput[k])
				score += 4;
			else
				score--;
		}
		
		System.out.println(score);
	}

}
