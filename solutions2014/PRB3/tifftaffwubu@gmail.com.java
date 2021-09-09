import java.util.Scanner;


public class PRB3 {
	public static void main(String[] args) 
    {
		Scanner kboard = new Scanner( System.in );
		int count = kboard.nextInt();
		int total = 0;
		for (int n = 0; n<count; n++)
		{
			int x = kboard.nextInt();
			total += x;
		}
		System.out.print(findMean(total, count));
		kboard.close();
    }
	
	public static int findMean(int total, int count)
	{
		int mean = total/count;
		return mean;
	}
}
//on a roll
//Tiffany Wu