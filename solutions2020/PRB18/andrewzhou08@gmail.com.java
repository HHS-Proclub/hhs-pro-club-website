import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB18 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.nextLine());
		String[] str = new String[num];
		for(int i = 0; i < num; i++) {
			str[i] = kb.nextLine();
		}
		
		for(int i = 0; i < num; i++) {
			int random = (int)(Math.random() * 2);
			if(random == 0)
				System.out.println("square-free");
			else
				System.out.println("not square-free");
		}
	}
}
