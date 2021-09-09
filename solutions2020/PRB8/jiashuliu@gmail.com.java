import java.util.Scanner;

public class PRB8 {
	public static void main(String args[]){		
		Scanner kbd = new Scanner(System.in);
		
		int height = kbd.nextInt();
		
		int time = (int) Math.sqrt(height * 2 / 10);
		
		System.out.println(time);
	}
}
