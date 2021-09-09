
import java.util.Scanner;

public class PRA2 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		String word1 = scanner.nextLine();
		String word2 = scanner.nextLine();
		String shorterWord = "";
		String longerWord = "";
		int numMatch = 0;
		if(word1.length() <=  word2.length()){
			shorterWord = word1;
			longerWord = word2;

		}
		if(word1.length() > word2.length()){
			shorterWord = word2;
			longerWord = word1;
		}
		longerWord = longerWord.toLowerCase();
		shorterWord = shorterWord.toLowerCase();

		for(int n = 0; n < shorterWord.length(); n++)
		{
			for(int count = 0; count < longerWord.length(); count++)
			{
				if(shorterWord.charAt(n) == longerWord.charAt(count)){
					if(n <  count){
					numMatch++;
					break;
					}
				}
				else{
					
				}
			}
		}
		System.out.println(longerWord.length() - numMatch);
	}
}
