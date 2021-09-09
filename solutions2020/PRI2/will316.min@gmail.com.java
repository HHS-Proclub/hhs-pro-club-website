import java.util.Scanner;

public class PRI2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int[] results = new int[scan.nextInt()];
		for (int i = 0; i < results.length; i++)
		{
			scan.nextInt();
			String num = scan.next();
			int[] list = new int[9];
			for (int j = 0; j < list.length; j++)
			{
				list[j] = scan.nextInt();
			}
			results[i] = maxNum(num, list);
		}
		
		for (int i = 0; i < results.length; i++)
		{
			System.out.println(results[i]);
		}
	}
	
	public static int maxNum(String str, int[] list)
	{
		String result = "";
		for (int i = 0; i < str.length(); i++)
		{
			int strNum = Integer.parseInt(str.charAt(i) + "");
			result += Math.max(strNum, list[strNum-1]);
		}
		return Integer.parseInt(result);
	}
}
