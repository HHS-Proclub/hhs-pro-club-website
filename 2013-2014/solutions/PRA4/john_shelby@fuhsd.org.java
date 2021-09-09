import java.util.Scanner;


public class PRA4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String in = new Scanner(System.in).nextLine();
		int len = in.length()+4;
		StringBuffer output = new StringBuffer(in);
		output.append("0000");
		boolean carry = false;
		for(int i = len-1; i >= 0; i--) {
			char a = (i-4 >= 0 ? in.charAt(i-4) : '0');
			char b = output.charAt(i);
			output.setCharAt(i, (a==b && carry || a!=b && !carry) ? '1' : '0');
			carry = (a == '1' && b == '1') || ((b == '1' || a == '1') && carry);
		}
		if (carry)
			output.insert(0, '1');
		System.out.println(output);
	}

}
