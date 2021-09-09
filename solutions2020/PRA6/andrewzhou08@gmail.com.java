import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.nextLine());
		String[] in = new String[n];
		for(int i = 0; i < n; i++) {
			in[i] = kb.nextLine();
		}
		
		int out = 0;
		
		
		
		for(int i = 0; i < n; i++) {
			if(canSay(in[i])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		
		
		//System.out.println(out);
	}
	
	public static boolean canSay(String str) {
		String test1 = "pi";
		String test2 = "ka";
		String test3 = "chu";
		
		if(str.equals("")) {
			return true;
		} else if(str.substring(0, 2).equals(test1) || str.substring(0, 2).equals(test2)) {
			return canSay(str.substring(2));
		} else if(str.substring(0, 3).equals(test3)) {
			return canSay(str.substring(3));
		}
		
		return false;
	}
}
