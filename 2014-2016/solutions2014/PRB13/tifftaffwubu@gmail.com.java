import java.util.Scanner;


public class PRB13 {
	public static String backwards(String s){
		String output="";
		for (int i = s.length()-1; i>=0; i--)
		{
			output = output + s.charAt(i);
		}
		return output;
	}
	public static boolean isPalindrome(String s){
		s = s.trim();
		s = s.replaceAll("[^A-Za-z0-9]", "");
		String c  = s.toLowerCase();
		if (backwards(c).equals(c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.print(isPalindrome(s));
		scan.close();
	}
}
//Tiffany Wu
//extra point, here i come
