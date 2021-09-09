import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if (a[i]<a[j]) {
					a[i] += a[j];
					a[j] = a[i]-a[j];
					a[i] -= a[j];
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

}
