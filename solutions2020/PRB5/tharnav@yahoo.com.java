import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfCases = in.nextInt();
		for(int i = 0; i < numOfCases; i++) {
			int next = in.nextInt();
			int then = in.nextInt();
			int realthen = (int)Math.pow(10, then);
			int stuff = realthen;
			while(stuff % next != 0) {
				stuff+=realthen;
			}
			System.out.println(stuff);
		}
	}
}
