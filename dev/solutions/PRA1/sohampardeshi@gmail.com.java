import java.util.Scanner;


public class PRA1 {
	public static void main(String[] Args){
		Scanner input = new Scanner(System.in);
		String hex1 = input.nextLine();
		String hex2 = input.nextLine();
		
		int first = Integer.parseInt(hex1, 16);
		int second = Integer.parseInt(hex2, 16);
		
		int gcd = gcd(first,second);
		System.out.println(gcd);
		String hexString = Integer.toHexString(gcd);
		
		while(hexString.length() < 4 && !(hexString.length() > 4))
			hexString = "0" + hexString;
		
		System.out.println(hexString);
	}
	public static int gcd(int a, int b) {
		   if(b == 0) 
			   return a;
		   return gcd(b,a%b);
	}
}
