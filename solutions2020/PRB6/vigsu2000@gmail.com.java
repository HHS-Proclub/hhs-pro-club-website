import java.util.Scanner;

public class PRB6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		for(int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(scan.nextLine());
		}
		boolean answer = false;
		for(int x = 0; x < 5; x++) {
			int totSum =0;
			for(int y = 0; y < 5; y++) {
				if(y != x) {
					totSum+=a[y];
				}
			}
			if(totSum==a[x]) {
				System.out.println(a[x]);
				answer = true;
			}
		}
		if(answer == false) {
			int sum = 0;
			for(int x = 0; x < 5; x++) {
				sum+=a[x];
			}
			System.out.println(sum);
		}
	}
}
