import java.util.Scanner;

public class PRA5 {
	public static void main(String[] Args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), up = 0, down = b * n;		
		while ((down -= b) > (up += a) + b);
		System.out.println(down < up ? down : up);
	}
}