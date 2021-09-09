import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB23 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String word = kb.nextLine();
		String[] words = word.split("\\s+");
		String out = "";
		
		for(String s : words) {
			out += s.charAt(0);
		}
		
		System.out.println(out);
	}
}
