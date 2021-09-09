import java.util.Scanner;
public class PRB9 {

	public static int p(String s){
		s = s.trim();
		String p = "";
		for(int i = 0; i < s.length(); i++)
		{
			p = s;	
			p = p + backwards(s.substring(0, i+1));

			if (isPalindrome(p))
			{
				return p.length();
			}
		}
		return 0;
}
		
	public static boolean isPalindrome(String s){
		if (backwards(s).equals(s))
		{
			return true;
		}
		else
		{
			return false;
		}
	
}
	public static String backwards(String s){
		String x="";
		for (int i = s.length()-1; i>=0; i--)
		{
			x = x + s.charAt(i);
		}
		return x;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.print(p(s));
		scan.close();
		
	}

}
//ty tutor
//Tiffany Wu