import java.util.ArrayList;
import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> s = new ArrayList<String>();
		int tests = sc.nextInt();
		for(int i = 0; i < tests; i++){
			String c = sc.next();
			String temp = c;
			if(c.charAt(0) != 'a' && c.charAt(1) != 'b'){
				temp = c.substring(2, c.length());
			} else if(c.charAt(1) != 'b'){
				temp = c.charAt(0) + c.substring(2, c.length());
			} else if(c.charAt(0) != 'a'){
				temp = c.substring(1, c.length());
			}
			s.add(temp);
		}
		for(int i = 0; i < s.size(); i++){
			System.out.println(s.get(i));
		}
		sc.close();
	}
}
