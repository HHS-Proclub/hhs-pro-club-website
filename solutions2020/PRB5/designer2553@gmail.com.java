import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PRB5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String[] vals1 = str1.split(" ");
		String str2 = in.nextLine();
		String[] vals2 = str2.split(" ");
		
		int[] nums1 = new int[vals1.length];
		for (int i = 0; i < nums1.length; i++) nums1[i] = Integer.parseInt(vals1[i]);
		Arrays.sort(nums1);
		
		int[] nums2 = new int[vals2.length];
		for (int i = 0; i < nums2.length; i++) nums2[i] = Integer.parseInt(vals2[i]);
		Arrays.sort(nums2);
		
		int sum = 0;
		for (int i = nums1.length-1; i >= 0; i--) {
			if (nums1[i] % 10 == 0) {
				sum += nums1[i];
				break;
			}
		}
		
		for (int i = nums2.length-1; i >= 0; i--) {
			if (nums2[i] % 10 == 0) {
				sum += nums2[i];
				break;
			}
		}
		
		System.out.println(sum);
	}

}
