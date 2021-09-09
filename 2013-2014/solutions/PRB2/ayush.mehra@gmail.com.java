import java.util.Scanner;

public class PRB2 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		input.nextLine();
		
		char [] scores = input.nextLine().toCharArray();
		
		int score = 0;
		
		for(int i= 0; i<num; i++)
		{
			score += Character.getNumericValue(scores[i]);
		}
		
		System.out.println(score);
	}
}
