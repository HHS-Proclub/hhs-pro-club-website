import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//String Replace

public class B4 
{
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		String original = scanner.nextLine();
		int number = scanner.nextInt();
		
		ArrayList<String> code = new ArrayList<String>();
		for (int i = 0; i < number; i++)
		{
			code.add(scanner.nextLine());
		}
		
		ArrayList<String> ordered = new ArrayList<String>();
		ArrayList<String> orderedCode = new ArrayList<String>();
		
		int maxWordLength = 0;
		for (int i = 0; i < number; i++)
		{
			String word = code.get(i).substring(code.get(i).indexOf("|") + 1);
			String wordCode = code.get(i).substring(0, code.get(i).indexOf("|"));
			
			if (word.length() > maxWordLength)
			{
				maxWordLength = word.length();
				ordered.add(word + " ");
				orderedCode.add(wordCode);
			}
			else
			{
				for (int j = 0; j < ordered.size(); j++)
				{
					if (word.length() <= ordered.get(j).length())
					{
						ordered.add(j, word);
						orderedCode.add(j, wordCode);
					}
				}
			}
		}
		
		Collections.reverse(ordered);
		Collections.reverse(orderedCode);
		
		for (int i = 0; i < number; i++)
		{
			original = original.replaceAll(orderedCode.get(i), ordered.get(i));
		}
		
		original = original.replace(original.substring(original.length() - 1), "");
		
		  
		  
	}
}
