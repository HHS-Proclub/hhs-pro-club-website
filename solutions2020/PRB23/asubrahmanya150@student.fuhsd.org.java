
import java.util.Scanner;

public class PRB23 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String original = in.nextLine();
		for(int i = 0; i < original.split(" ").length; i++){
			System.out.print(original.split(" ")[i].substring(0, 1));
		}
	}
}
