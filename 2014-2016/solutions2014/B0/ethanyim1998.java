import java.util.Scanner;


public class B0 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
	
		String[] names = new String[number];
		for (int i = 0; i < number; i++)
		{
			names[i] = scanner.nextLine();
		}
		for (int i = 0; i < number; i++)
		{
			System.out.println(names[i]);
		}
	}
}
