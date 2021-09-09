import java.util.Arrays;
import java.util.Scanner;

public class PRB14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		String[] raw = new String[n];
		for(int i = 0;i<n;i++){
			raw[i] = sc.nextLine();
		}
		sc.close();
		for(int i = 0;i<n;i++){
			System.out.println(work(raw[i]));
		}
	}

	public static int work(String s) {
		String[] raw = s.split(" ");
		int[] nums = new int[raw.length];
		for (int i = 0; i < raw.length; i++) {
			nums[i] = Integer.parseInt(raw[i]);
		}
		int a = 1;
		Arrays.sort(nums);
		 
        // Traverse the array and increment 'res' if arr[i] is
        // smaller than or equal to 'res'.
        for (int i = 0; i < nums.length && nums[i] <= a; i++)
            a = a + nums[i];
 
        return a;
		
	}
	
	
}
