
import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int st = s.nextInt();
		int[] j = new int[st];
		for(int i = 0;i<st;i++) {
			j[i] = s.nextInt()+s.nextInt();
		}
		for(int i = 0;i<st;i++) {
			System.out.println(j[i]);
		}
	}

}
