//package Round1;

import java.util.Arrays;
import java.util.Scanner;

public class R1A3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		if (isAnagram(a,b)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	
	public static boolean isAnagram(String first, String second) {
	     char[] a = first.toCharArray();
	     char[] b = second.toCharArray();
	     Arrays.sort(a);
	     Arrays.sort(b);
	     return Arrays.equals(a, b);
	}
}
