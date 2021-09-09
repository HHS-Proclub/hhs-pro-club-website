
import java.util.Scanner;
public class PRA5{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int answer = 1;
		for(int i = 0; i < x; i++) {
			answer*=2;
		}
		System.out.println(answer - 1);
		in.close();
	}
}
