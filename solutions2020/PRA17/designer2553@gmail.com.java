
import java.util.*;

class PRA17
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		int cases = in.nextInt();
		
		for (int c = 0; c < cases; c++) {
			int num = in.nextInt();
			System.out.println(oddDiv(num));
		}
	}
	
	public static long oddDiv (int n) {
		if (n == 1) {
			return n;
		} else if ((n & 1) == 1) {
			return oddDiv(n-1) + n;
		} else {
			int num = n/2;
			while ((num & 1) != 1) {
				num /= 2;
			}
			
			return oddDiv(n-1) + num;
		}
	}
}