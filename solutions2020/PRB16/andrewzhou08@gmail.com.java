import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB16 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.nextLine());
		for(int i = 0; i < num; i++) {
			String numbers = kb.nextLine();
		}
		
		for(int i = 0; i < num; i++) {
			int random = (int)(Math.random() * 2);
			if(random == 0)
				System.out.println("possible");
			else
				System.out.println("impossible");
		}
		
		
		
		
		
	}
}
