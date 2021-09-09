import java.util.*;

public class PRA4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// n += 96;
		
		ArrayList<Character> arr = new ArrayList<Character>(n);
		
		for (int x = 1; x <= n; x++) {
			arr.add((char) ((char)x+96));
		}
		String word = "";
		for(int x = 0; x < n; x++) {
			word += arr.get(x);
		}

		getPermutation("", word);
	}
	
	private static void getPermutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            getPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

}
