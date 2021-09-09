import java.util.Scanner;


public class VSB5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		String[] out = new String[n/2];
		for (int i = 0; i < n/2; i++) {
			out[i] = "";
			for (int j = 0; j < i; j++)
				out[i]+=" ";
			out[i]+="*";
			for (int j = 0; j < n-2-(2*i); j++)
				out[i]+=" ";
			out[i]+="*";
			for (int j = 0; j < i; j++)
				out[i]+=" ";
		}
		for(int i = 0; i < out.length; i++)
			System.out.println(out[i]);
		for (int j = 0; j < n/2; j++)
			System.out.print(" ");
		System.out.print("*");
		for (int j = 0; j < n/2; j++)
			System.out.print(" ");
		System.out.println();
		for(int i = out.length-1; i >= 0; i--) {
			System.out.println(out[i]);
		}
		
		

	}

}
