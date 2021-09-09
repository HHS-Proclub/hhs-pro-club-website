import java.util.Scanner;

public class PRA4 {
	
	public static void main(String[] args) {
		
		Scanner Kboard = new Scanner(System.in);
		int a = Kboard.nextInt();
		int b = Kboard.nextInt();
		int c = Kboard.nextInt();
		int highest = 0;
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					if (i+j > k && j+k > i && k+i > j) {
						if (i+j+k > highest) {
							highest = i+j+k;
						}
					}
				}
			}
		}
		
		System.out.println(highest);
	}

}
