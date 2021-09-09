import java.util.Scanner;

public class PRA13 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		while(true) {

		long w = Kboard.nextLong();
		long h = Kboard.nextLong();
		long m = Kboard.nextLong();
		
		long temp = 0;
		
		long big = 0;
		long small = 0;
		
		if (w > h) {
			big = w;
			small = h;
		} else {
			big = h;
			small = w;
		}
		
		long answer = 0;
		if(m == 0) {
			System.out.println(0);
		} else {
			int counter = 0;
			while (true) {
				if(big*small<m) {
					System.out.println(big*small);
					System.exit(0);
				} else {
					if(counter%2==0) {
						big--;
					} else {
						small--;
					}
				}
			}
		}
		}
	}
}
