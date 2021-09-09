import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB5 
{	
	private ArrayList<Character> chars;
	private ArrayList<Integer> occurance;
	
	public PRB5()
	{
		occurance = new ArrayList<Integer>();
		chars = new ArrayList<Character>();
	}
	
	private void organize(String input)
	{
		char[] in = input.toCharArray();
		Arrays.sort(in);
		
		chars.add(in[0]);
		occurance.add(1);
		
		for (int i = 1; i < in.length; i++)
		{
			if (in[i] == in[i-1])
			{
				int currentOccurance = occurance.get(occurance.size()-1);
				occurance.set(occurance.size()-1, currentOccurance+1);
			}
			else
			{
				chars.add(in[i]);
				occurance.add(1);
			}
		}
	}
	
	private void printResults()
	{
		for (int i = 0; i < chars.size(); i++)
		{
			System.out.println (chars.get(i) + " " + occurance.get(i));
		}
	}
	
	public static void main (String args[])
	{
		PRB5 tester = new PRB5();
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		tester.organize(input);
		tester.printResults();
	}
}
