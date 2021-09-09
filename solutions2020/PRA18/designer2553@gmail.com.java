import java.util.*;

class PRA18
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		for (int c = 0; c < cases; c++) {
			String s = in.next();
			
			if (s.charAt(0) != 'a') {
				System.out.println("Bad");
				continue;
			}
			
			int as = 0, bs = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a') {
					as++;
				} else {
					bs++;
				}
			}
			
			if (as == bs) {
				System.out.println("Good");
			} else {
				System.out.println("Bad");
			}
		}
	}
}