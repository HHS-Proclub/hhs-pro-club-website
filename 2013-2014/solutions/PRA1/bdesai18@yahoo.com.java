import java.util.*;

public class PRA1
{
	public static void main(String[] args)
	{
		Scanner intScan = new Scanner(System.in);
		Scanner stringScan = new Scanner(System.in);
		int displacement = intScan.nextInt();
		String input = stringScan.nextLine();
		String output = "";
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) != ' ')
			{
				if(input.charAt(i) <= 122 - displacement)
				{
					output += (char)(input.charAt(i) + displacement);
				}
				else
				{
					output += (char)(input.charAt(i) - 26 + displacement);
				}
			}
			else
			{
				output += ' ';
			}
		}
		System.out.println(output);
	}
}