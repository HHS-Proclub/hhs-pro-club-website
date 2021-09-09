import java.util.Scanner;

public class PRB5 
{	
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i = 0; i < x; i++)
		{
			int n = kb.nextInt();
			int k = kb.nextInt();
			for(int j = 1; true; j++)
			{
				int ans = (int)(Math.pow(10, k) * j);
				if(ans % n == 0)
				{
					System.out.println(ans);
					break;
				}
			}
		}
	}
}
