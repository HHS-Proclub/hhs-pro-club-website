import java.util.ArrayList;
import java.util.Scanner;

public class PRB12 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	
		int num = scan.nextInt();
		
		
		ArrayList<String> myList = new ArrayList<String>();

        
		for(int i = 0; i < num +1; i++){
			String s = scan.nextLine();
			String temp = half(s);
			myList.add(temp);
		}

		for(int i = 0; i < num + 1; i++){
			System.out.println(myList.get(i));
		}
	}
	
	public static String half(String s){
		int x = s.length();
		String fin = s.substring(0,(x/2));
		
		
		
		
		return fin;
	}

}
