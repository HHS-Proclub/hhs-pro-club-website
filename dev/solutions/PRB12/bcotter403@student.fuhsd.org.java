import java.util.Scanner;

public class PRB12 {

	public static int repeatLength(String s) {
		int o = 0, k = 1;
		char c = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				k++;
				if (k > o)
					o = k;
			} else
				k = 1;
			c = s.charAt(i);
		}
		return o;
	}

	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		k.next();
		System.out.println(PRB12.repeatLength(k.nextLine()));
		k.close();
	}
}
