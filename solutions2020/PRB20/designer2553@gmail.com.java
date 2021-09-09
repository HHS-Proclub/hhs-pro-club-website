import java.util.Scanner;

public class PRB20 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), v = in.nextInt();
		final int mod = 1000000007;
		int[] arr = new int[n];
		int index = n-1;
		int count = 0;
		
		while (arr[0] != k) {
			arr[index] = (arr[index]+1) % mod;
			
			for (int i = index; i > 0; i--) {
				if (arr[i] == k) {
					arr[i] = 0;
					arr[i-1] = (arr[i-1]+1) % mod;
				}
			}
			
			if (arrMultiply(arr) % k == v) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static int arrMultiply (int[] arr) {
		int product = 1;
		
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		
		return product;
	}
}
