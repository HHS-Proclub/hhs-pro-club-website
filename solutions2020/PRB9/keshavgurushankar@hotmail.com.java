//package PR_9;

import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		String print[] = new String[cases];
		for (int i = 0; i < cases; i++) {
			String test = in.nextLine();
			if (test.charAt(0)=='a' && test.charAt(1)=='b'){ 
				print[i] = test;
			} else if (test.charAt(0)=='a'){
				print[i] = "a"+test.substring(2);
			} else if (test.charAt(1)=='b'){
				print[i] = test.substring(1);
			} else {
				print[i] = test.substring(2);
			}
		}
		in.close();
		for (int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
	}
}
