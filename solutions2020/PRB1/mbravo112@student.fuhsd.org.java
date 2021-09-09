import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int[] results = new int[testCases];
		int n;
		for (int i = 0; i < testCases; i++) {
			n = sc.nextInt();
			int notChangingN = n;
			//System.out.println("sc" + n);
			int count = 0;
			for (int j = 1; j <= notChangingN; j++) {
				n -= j;
				count++;
				if(n < 0) {
					results[i] = count-1;
					break;
				} else if (n == 0) {
					results[i] = count;
				}
			}
		}
		
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
}
