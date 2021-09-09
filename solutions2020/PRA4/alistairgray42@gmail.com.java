import java.util.Scanner;

public class PRA4 
{
	private int a;
	private int b;
	private int c;
	
	
	public PRA4()
	{
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		int aDiff;
		int bDiff;
		int cDiff;
		
		while (!check())
		{
			aDiff = a - b - c;
			bDiff = b - a - c;
			cDiff = c - a - b;
			
			if (aDiff > bDiff && aDiff > cDiff) a--;
			else if (bDiff > aDiff && bDiff > cDiff) b--;
			else if (cDiff > bDiff && cDiff > aDiff) c--;

		}
		success();
		
	}
	
	private boolean check()
	{
		return (a < b + c && b < a + c && c < a + b);
	}
	
	private void success()
	{
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args)
	{
		PRA4 blah = new PRA4();
	}
	
}
