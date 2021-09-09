import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if(s.length() <= 2){
			System.out.println("");
			return;
		}
		String fin = "";
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		
		
		
		if(c1 != ('a')  ){
			 s = s.substring(1);
		}

		if(c2 != ('b')  ){
			 s = s.substring(1);
		}
		
		System.out.println(s);
		
	}

}
