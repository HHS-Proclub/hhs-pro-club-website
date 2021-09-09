import java.util.Scanner;
public class VSB4 {
	public static void main (String args[]){
		Scanner kbd = new Scanner(System.in);
		String input = kbd.next();
		input = input.replace("*", " ");
		System.out.println(input);
	}
}
