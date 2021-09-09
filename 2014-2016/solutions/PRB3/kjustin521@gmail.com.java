import java.util.Scanner;

public class PRB3 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int a = sc.nextInt();
		int answer = 0;
		int calories[] = new int[a];
		PRB3 random = new PRB3();
		for(int i = 0; i < a; i++)
		{
			calories[i] = random.getInt();
			if(calories[i] > answer)
				answer = calories[i];
		}
		System.out.println(answer);
	}
	
	public int getInt()
	{
		int a = sc.nextInt();
		return a;
	}
}
