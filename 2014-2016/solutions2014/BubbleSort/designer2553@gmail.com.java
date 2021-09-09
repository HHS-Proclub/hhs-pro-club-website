import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=n;i>=0;i--) {
			for(int j=n;j>=0;j--) {
				try {
				if (a[i]<a[j]) {
					a[i] += a[j];
					a[j] = a[i]-a[j];
					a[i] -= a[j];
				}
				} catch (ArrayIndexOutOfBoundsException e) {
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

}
