import java.util.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class PRB13
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int ones = in.nextInt();
		int twos = in.nextInt();
		in.nextInt(); // 3 does not exist in 12 or 142
		int fours = in.nextInt();
 
		int num12s = 0, num142s = 0;
 
		while (ones > 0 && twos > 0 && fours > 0) {
			num142s++;
			ones--;
			twos--;
			fours--;
		}
 
		while (ones > 0 && twos > 0) {
			num12s++;
			ones--;
			twos--;
		}
 
		System.out.println(num12s * 12 + num142s * 142);
	}
}