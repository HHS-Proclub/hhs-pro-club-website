import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		String[] array;
		String str = kboard.nextLine();
		array = str.split(" ");
		String str2 = "";
		for (String str1: array)
		{
			if (str1.equals("not") == false)
			{
				str2 += str1 + " ";
			}
		}
		System.out.println(str2);
	}
}
