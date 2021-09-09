import java.util.Scanner;

public class PRA7 {
	private static int highest;
	
	public static void method(int pointer1, int pointer2, int total, String word) {
		//System.out.println(pointer1+" "+pointer2+" "+total);
		if(pointer2 == pointer1) {
			total++;
		}
		if(pointer2 <= pointer1) {
				//System.out.println(total);
				if(highest < total)
				highest = total;
		} 
		else {
			//System.out.println(total);
			if(word.charAt(pointer1) == word.charAt(pointer2)) {
				//System.out.println(pointer1+" "+pointer2+" "+total);
				method(pointer1+1, pointer2-1, total+2, word);
			} else {
				method(pointer1+1, pointer2, total, word);
				method(pointer1, pointer2-1, total, word);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		String word = Kboard.nextLine();
		
		highest = 0;
		
		method(0, word.length()-1, 0, word);
		
		System.out.println(highest);
	}
	
}
