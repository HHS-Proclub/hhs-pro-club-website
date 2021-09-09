import java.util.Scanner;

public class PRB4 {
	public static void main (String[] args) {
		Scanner kboard = new Scanner(System.in);
			int i = kboard.nextInt();
			int j = kboard.nextInt(); 
			for(int r = 1; r <= j; r++){
				System.out.println(r * i);				
			}
		}
	}
