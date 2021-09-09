import java.util.Scanner;

public class PRI1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int probs = Integer.parseInt(s.nextLine());
		while(probs>0) {
			probs--;
			String[] ins = s.nextLine().split(" ");
			int B = Integer.parseInt(ins[0]);
			int S = Integer.parseInt(ins[1]);
			int H = Integer.parseInt(ins[2]);
			int min = Math.min(S, H);
			System.out.println((B-min+1));
		}
	}
	
}
