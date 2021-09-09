import java.io.*;
import java.util.*;

public class NumberSuffixes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] str = new String[n];
		for (int i = 0; i < n; i++)
			str[i] = in.nextLine();
		
		Arrays.sort(str, new Comp());
		
		for (String s : str)
			System.out.println(s);
	}
	
	private static class Comp implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			int ind1 = findNumberSuffix(o1);
			int ind2 = findNumberSuffix(o2);

			return o1.substring(ind1).compareTo(o2.substring(ind2));
		}
		
		public int findNumberSuffix(String s) {
			for (int i=s.length(); i>0; i--)
				if (!Character.isDigit(s.charAt(i-1)))
					return i;
			return s.length() - 1;
		}
	}
}