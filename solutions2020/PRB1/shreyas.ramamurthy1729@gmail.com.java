import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) 
	{	
		Scanner kboard = new Scanner(System.in);
		int Integer = kboard.nextInt();
		for(int i = 0; i < Integer; i++) {
			int value = kboard.nextInt();
			double n = (Math.sqrt(8*value+1)-1)/2;
			double n2 = Math.floor(n);
			System.out.println((int)n2);
		}
	}
}
