import java.util.Scanner;


public class PRB12 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String s = in.next();
		
		int max = 0;
		char occ = s.charAt(0);
		int occi = 0;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x == occ) {
				occi++;
			} else {
				
				if (occi > max)
					max = occi;
				
				occ = x;
				occi = 1;
			}
		}
		
		System.out.println(max);
	}

}
