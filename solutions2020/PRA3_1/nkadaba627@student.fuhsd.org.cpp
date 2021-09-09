import java.util.Arrays;
import java.util.Scanner;

public class PRA3_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int[] ans = new int[n];
		for(int j = 0;j<n;j++) {
			String[] a = s.nextLine().split(" ");
			int k = Integer.parseInt(a[0]);
			int i = Integer.parseInt(a[1]);
			a = s.nextLine().split(" ");
			int[] nums = new int[i];
			for(int l = 0;l<i;l++) {
				nums[l] = Integer.parseInt(a[l]);
			}
			Arrays.sort(nums);
			int e = 0;
			int temp = 0;
			for(int q = i-1;q>0;q--) {
				if(temp==0) {
					temp = k - nums[q];
					e += temp+nums[q];
				} else {
					temp = temp - nums[q];
					e += temp+nums[q];
				}
			}
			ans[j] = e;
		}
		for(int p:ans) {
			System.out.println(p);
		}
	}

}
