import java.util.Scanner;

public class PRB13 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int ones = kb.nextInt();
		int twos = kb.nextInt();
		int threes = kb.nextInt();
		int fours = kb.nextInt();
		
		int num142s = Math.min(ones, Math.min(twos, fours));
		ones = ones - num142s;
		twos = twos - num142s;
		fours = fours - num142s;
		
		int num12s = Math.min(ones, twos);
		
		
		
		int out = 142*num142s + 12*num12s;
		
		
		System.out.println(out);
	}
}
