import java.util.Scanner;


public class PRB6 {

	public static void main(String[] args){
		
		
		Scanner kboard = new Scanner (System.in);
		char c = kboard.next().charAt(0);
		kboard.nextLine();
		String text = kboard.nextLine();
		
		int count = 0;
		for (int i = 0; i < text.length(); i++){
			if (text.charAt(i) == c) count++;
		}
		
		System.out.println(count);
	}
	
}
