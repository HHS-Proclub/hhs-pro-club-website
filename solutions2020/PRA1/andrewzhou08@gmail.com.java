import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a = kb.nextLine();
		String b = kb.nextLine();
		String c = kb.nextLine();
		String d = kb.nextLine();
		String e = kb.nextLine();
		
		for(int i = 0; i < 5; i++) {
			int random = (int)(Math.random()*2);
			if(random == 0) System.out.println("true");
			else System.out.println("false");
		}
	}
}
