import java.util.Scanner;


public class PRA1 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int x = Integer.parseInt(kboard.nextLine(),16);
		int y = Integer.parseInt(kboard.nextLine(),16);
		int z = GCD(x,y);
		System.out.println(z);
		String hex = Integer.toString(z, 16).toUpperCase();
		while(hex.length() < 4)
			hex = "0"+hex;
		System.out.println(hex);
	}
	
	public static int GCD(int a, int b) {
	   if (b==0) return a;
	   return GCD(b,a%b);
	}
	
}
