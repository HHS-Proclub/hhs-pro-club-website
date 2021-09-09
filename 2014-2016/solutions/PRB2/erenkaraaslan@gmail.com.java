import java.util.Scanner;
public class PRB2 {
	public static void main (String[] args) {
		Scanner Eren = new Scanner(System.in);
		int number = Eren.nextInt ();
		int number2 = Eren.nextInt();
		
		int sum = 0;
		int count = 0;
		
		if (number > 0)
		{
			for (int i = number; i <= number2; i++)
			{
				sum = sum + i;
				count++;
		
			}
		}
		else
		{
			for (int i = 1; i < number2; i++)
			{
				sum = sum + i;
				count++;
		
			}
		}
		System.out.println((double) sum/count);	
	}
	}
