import java.util.Arrays;
import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String word1 = kboard.next();
		char[] a1 = word1.toCharArray();
		Arrays.sort(a1);
		int count = 0;
		char c = ' ';
		for (int i = 0; i < a1.length; i++){
			c = a1[i];
			count ++;
			if (i == a1.length - 1 ||c != a1[i+1]){
				System.out.println(c + " " + count);
				count = 0;
			}
		}
	}

}
