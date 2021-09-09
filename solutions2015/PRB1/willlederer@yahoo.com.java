import java.util.Scanner;

public class PRB1 {
	public static void main (String[] args){
		while (true){
			System.out.println("Hello Please Input Your Number");
			int n;
			Scanner in = new Scanner (System.in);
			n = in.nextInt();
			System.out.println(n * 3);
		}
	}
}
