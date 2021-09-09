import java.util.Scanner;


public class PRB13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
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
		System.out.println(result);
	}

}
