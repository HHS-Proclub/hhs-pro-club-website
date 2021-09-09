import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.nextLine());
		String[] stuff = new String[n];
		
		for(int i = 0; i < n; i++) {
			boolean first = false;
			boolean second = false;
			String a = kb.nextLine();
			if(a.charAt(0) == 'a') {
				first = true;
			}
			if(a.charAt(1) == 'b') {
				second = true;
			}
			
			if(!second) {
				a = a.substring(0, 1) + a.substring(2);
			}
			if(!first) {
				a = a.substring(1);
			}
			stuff[i] = a;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(stuff[i]);
		}
		
		
		
		
		
		int out = 0;
		
		
		//System.out.println(out);
	}

	public static boolean isDivisible(int a, int b) {
		if(a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
}
