/**
 * @author Rishikesh Devanathan
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PRB1
{
	
	public static void main (String[] args) throws FileNotFoundException
	{
		Scanner inputStream = new Scanner(System.in);
		int length = Integer.parseInt(inputStream.next());
		
		for (int i = 0; i < length; i++)
		{
			int input = Integer.parseInt(inputStream.next());
			System.out.println(solve(input));
		}
	}
	
	public static int solve(int input)
	{
		
		int result = 0;
		
		for (int i = 1, n = 1; i <= input; n++, i+=n)
		{
			result++;
		}
		
		return result;
	}
}
