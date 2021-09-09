import java.util.Arrays;
import java.util.Scanner;

public class PRB16 {

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int cases = in.nextInt();
		in.nextLine();
		
		Main: for (int c = 0; c < cases; c++) {
			String[] strs = in.nextLine().split(" ");
			int[] list = new int[strs.length];
			
			for (int i = 0; i < strs.length; i++) {
				list[i] = Integer.parseInt(strs[i]);
			}
			
			int maxOccurances = (int)Math.round(list.length/2.0);
			int number = Integer.MIN_VALUE;
			int occurances = 0;
			Arrays.sort(list);
			
			for (int i = 0; i < list.length; i++) {
				int n = list[i];
				if (n != number) {
					number = n;
					occurances = 0;
				}
				occurances++;
				
				if (occurances > maxOccurances) {
					System.out.println("impossible");
					continue Main;
				}
			}
			
			System.out.println("possible");
		}
	}
}
