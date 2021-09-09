// This converts English words into pig latin.

import java.util.*;
public class PRB4 {

	private static String word;
	private static Scanner kboard;
	
	public static void main (String[] args)
	{
		kboard = new Scanner (System.in);
		int n = kboard.nextInt();
		int i;
		
		for (i = 65; i < n + 65; i++)
		{
			word = kboard.next();
			
			switch (word.substring(0, 1))
			{
			
			case "a":
				word = word + "way";
				break;
				
			case "e":
				word = word + "way";
				break;
				
			case "i":
				word = word + "way";
				break;
				
			case "o":
				word = word + "way";
				break;
				
			case "u":
				word = word + "way";
				break;
				
			default:
				word = word.substring(1) + word.substring(0, 1) + "ay";
				break;
			}
			
			System.out.println(word);
		}
		
	}
	
}
