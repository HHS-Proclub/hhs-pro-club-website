import java.util.Scanner;

public class R1B1 {
	public static void main(String args[])
	{
		Scanner kboard = new Scanner(System.in);
		String first;
		String desired;
		first = kboard.nextLine();
		desired = kboard.nextLine();
		int length = desired.length();
		int length2 = first.length();
		int length3;
		int total=0;
		if (length>length2)
		{
			length3=length;
		}
		else
		{
			length3=length2;
		}
		for (int x=0; x<length3; x++)
		{
			if (desired.contains(first.charAt(x)) == true)
			{
				
			}
		}
	}
}
