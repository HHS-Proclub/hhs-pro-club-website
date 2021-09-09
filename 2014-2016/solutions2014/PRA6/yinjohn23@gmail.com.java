package lookandsayreverse;

import java.util.Scanner;


public class PRA6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt() - 1;
		String start = "1";
		for(int j = 0; j < i; j++) {
			start = nextString(start);

		}
		System.out.println(start);
	}
	public static String nextString(String in) {
		String out = "";
		char current = in.charAt(0);
		int count = 1;
		for(int i = 1; i < in.length(); i++) {
			if(in.charAt(i) == current){

				count++;
			}
			else {
				out += count + "" + current;
				current = in.charAt(i);
				count = 1;
			}
		}
		out += count + "" + current;
		StringBuffer buffer = new StringBuffer(out);
		return buffer.reverse().toString();
	}

	
}
