import java.util.Scanner;

public class PRB9 {
	public static void main(String args[]) {
		String str = "";
		Scanner kb = new Scanner(System.in);
		int kk = kb.nextInt();
		
		for(int i = 0; i < kk; i++) {
			str += kb.next();
		}
		int output = 0;
		
		for(int i = 0; i < str.length(); i++) {
			String ii = str.charAt(i)+ "" + Math.abs(Integer.parseInt(str.charAt(i)+"")-10);
			output = Integer.parseInt(ii);
			System.out.println(output);
		}
		
		kb.close();
		
	}
}
