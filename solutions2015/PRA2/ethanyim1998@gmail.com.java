import java.util.Scanner;

public class PRA2 
{
	public static void main (String args[])
	{
		Scanner x = new Scanner(System.in);
		String input1 = x.next();
		String input2 = x.next();
		
		PRA2 tester = new PRA2();
		int minNumEdits = tester.getNum(input1, input2, input1.length(), input2.length());
		System.out.println(minNumEdits);
	}
	
	public int getNum(String str1, String str2, int length1, int length2)
	{
		if (length1 == 0)
			return length2;
		else if (length2 == 0)
			return length1;
		else if (str1.charAt(length1 - 1) == str2.charAt(length2 - 1))
			return getNum(str1, str2, length1-1, length2-1);
		else
		{
			int min1 = Math.min(getNum(str1, str2, length1, length2-1), getNum(str1, str2, length1 - 1, length2));
			int min2 = Math.min(getNum(str1, str2, length1 - 1, length2), getNum(str1, str2, length1 - 1, length2 - 1));
			int actualMin = Math.min(min1,  min2);
			return 1 + actualMin;
		}
	}
}
