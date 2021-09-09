import java.util.ArrayList;
import java.util.Scanner;

public class PRB6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] in = new int[5];
		in[0] = Integer.parseInt(kb.nextLine());
		in[1] = Integer.parseInt(kb.nextLine());
		in[2] = Integer.parseInt(kb.nextLine());
		in[3] = Integer.parseInt(kb.nextLine());
		in[4] = Integer.parseInt(kb.nextLine());
		
		int out = 0;
		if(in[0] == (in[1] + in[2] + in[3] + in[4]))
			out = in[0];
		else if(in[1] == (in[0] + in[2] + in[3] + in[4]))
			out = in[1];
		else if(in[2] == (in[0] + in[1] + in[3] + in[4]))
			out = in[2];
		else if(in[3] == (in[0] + in[1] + in[2] + in[4]))
			out = in[3];
		else if(in[4] == (in[0] + in[1] + in[3] + in[2]))
			out = in[4];
		else
			out = in[0] + in[1] + in[2] + in[3] + in[4];
		
		
		System.out.println(out);
	}

	public static boolean isDivisible(int a, int b) {
		if(a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
}
