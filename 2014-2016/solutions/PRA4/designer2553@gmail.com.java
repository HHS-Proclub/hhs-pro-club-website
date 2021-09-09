import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA4 {
	private static final char PRELUDE_TO_LOWERCASE = 97;
	
	public static void main (String[] args) {
		Scanner kboard = new Scanner (System.in);
		int n = kboard.nextInt();
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			buffer.append((char)(i+PRELUDE_TO_LOWERCASE));
		}
		
		
		printPermutations(buffer.toString(), new ArrayList<String>());
		kboard.close();
	}
	
	public static void printPermutations(String in, ArrayList<String> list) {
		printPermutation(in, "", list);
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	private static void printPermutation (String in, String base, List<String> list) {
		if (in.isEmpty()) {
//			System.out.println();
			list.add(base);
		} else {
			for (int i = 0; i < in.length(); i++) {
//				System.out.print(in.charAt(i));
				printPermutation(new StringBuffer(in).deleteCharAt(i).toString(), base + in.charAt(i), list);
			}
		}
	}
}
