import java.util.Scanner;

public class PRA12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		in.nextLine();
		
		for (int i = 0; i < cases; i++) {
			String s = in.nextLine();
			StringBuffer sb = new StringBuffer(s);
			
			boolean possible = true;
			Main: while (sb.length() != 0) {
				
				for (int j = 1; j < sb.length(); j++) {
					char a = sb.charAt(j-1);
					char b = sb.charAt(j);
					
					if (a == b) {
						sb.delete(j-1, j+1);
						continue Main;
					}
				}
				
				possible = false;
				break; // Why keep looping if the string can't be modified any further?
			}
			
			System.out.println(possible ? "Possible" : "Impossible");
		}
	}

}
