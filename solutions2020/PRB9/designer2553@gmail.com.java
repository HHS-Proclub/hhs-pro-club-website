import java.util.Scanner;

public class PRB9 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		in.nextLine();
		String[] results = new String[times];
		
		for (int i = 0; i < results.length; i++) {
			String current = in.nextLine();
			StringBuffer sb = new StringBuffer(current);
			
			if (sb.charAt(1) != 'b') {
				sb.deleteCharAt(1);
			}
			if (sb.charAt(0) != 'a') {
				sb.deleteCharAt(0);
			}
			
			results[i] = sb.toString();
		}
		
		for (String s : results)
			System.out.println(s);
	}
}
