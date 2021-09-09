import java.util.Scanner;

public class PRB12 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.nextLine());
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = kb.nextLine();
		}
		
		for(int i = 0; i < n; i++) {
			int len = str[i].length();
			System.out.println(str[i].substring(0, len/2));
		}
		
		
		int out = 0;
		
		
		//System.out.println(out);
	}
}
