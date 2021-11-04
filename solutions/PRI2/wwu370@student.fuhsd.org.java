
import java.util.Scanner;
import java.lang.Math;

public class PRI2 {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			input = sc.nextLine();
			System.out.println(Daisy(input));
		}

	}

	public static int Daisy(String num) {
		int bits=num.length();
		for(int i=0;i<num.length()-1;i++){
			if(num.charAt(i)=='0'){
				bits++;
			}
		}
		return bits+1;
	}
}