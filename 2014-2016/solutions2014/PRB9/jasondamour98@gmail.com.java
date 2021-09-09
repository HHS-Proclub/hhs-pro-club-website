import java.util.Scanner;


public class PRB9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String firstHalf = input.nextLine(), secondHalf="", result="";
		boolean answer=false;
		
		for(int i=0; i<firstHalf.length(); i++)
		{
			answer = isPalindrome(firstHalf+secondHalf);
			if(answer==false){
				secondHalf = firstHalf.charAt(i) + secondHalf;
			}
		}
		
		System.out.println((firstHalf+secondHalf).length());
		
		
		
		
	}
	private static boolean isPalindrome(String s)
	{
		boolean result=false;
		String str1 = "", str2 = "";
		char char1, char2;
		s = s.replace(" ", "");
		int lastIndex = s.length(), startIndex = 0;
		
		for(int i=0; i < s.length()/2; i++)
		{
			char1 = s.charAt(startIndex);
			char2 = s.charAt(lastIndex-1);
			if(Character.isLetter(char1))
			{
				startIndex++;
				if(Character.isLetter(char2))
				{
					lastIndex--;
					str1=""+char1;
					str2=""+char2;
					if(str1.equalsIgnoreCase(str2))
					{
						result = true;
					}
					else
					{
						result = false;
						break;
					}
				}
				else
				{
					startIndex--; i--; lastIndex--;
				}
			}
			else
			{
				startIndex++; i--;
			}
		}
		
		return result;
	}


}
