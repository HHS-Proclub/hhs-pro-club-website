import java.util.ArrayList;
import java.util.Scanner;

public class PRA3 {
	private static ArrayList <Integer> numbers = new ArrayList<Integer>();
	public static void main(String[]args)
	{
		Scanner util = new Scanner(System.in);
		int max = util.nextInt();
		for(int i =0;i<max;i++)
		{
			numbers.add(util.nextInt());
		}
		findPosition();
	}
	public static int findPosition()
	{
		for(int i =0;i<=numbers.size()-1;i++)
		{
			int right = 0;
			int left = 0;
			
			for(int x=i+1;x<=numbers.size()-1;x++)
			{
				right+=numbers.get(x);
			}
			for(int y=i-1;y>=0;y--)
			{
				left+=numbers.get(y);
			}
				if(left==right)
				{
					System.out.println(i);
				}
			
		}
		return 0;
		
	}
}
