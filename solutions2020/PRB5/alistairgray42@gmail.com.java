import java.util.Scanner;

public class PRB5 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int x;
		
		String line = scan.nextLine();
		String[] aLines = line.split(" ");
		line = scan.nextLine();
		String[] bLines = line.split(" ");

		for (int i = 0; i < aLines.length; i++)
		{
			int intA = Integer.parseInt(aLines[i]);
			if (intA > a && intA % 10 == 0) a = intA;
		}
		
		for (int i = 0; i < bLines.length; i++)
		{
			int intB = Integer.parseInt(bLines[i]);
			if (intB > b && intB % 10 == 0) b = intB;
		}
		
		System.out.println(a + b);
	}
}
