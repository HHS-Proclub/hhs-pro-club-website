import java.util.Scanner;

public class PRA14 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();
		
		for (int t = 0; t < trials; t++) {
			int size = in.nextInt(), max = in.nextInt();
			int[] workArr = new int[size];
			
			for (int i = 0; i < workArr.length; i++) {
				workArr[i] = 1;
			}
			
			long varunLikes = 0;
			while (totalSum(workArr) <= max*size) {
				
				boolean endorsedByVarun = true;
				for (int i = 1; i < workArr.length; i++) {
					int a = workArr[i-1], b = workArr[i];
					
					if (a <= b || a % b != 0);
					else {
						endorsedByVarun = false;
						break;
					}
				}
				
				if (endorsedByVarun) varunLikes++;
				
				workArr[workArr.length-1]++;
				topOffArray(workArr, max);
			}
			
			System.out.println(varunLikes);
		}
	}
	
	public static int totalSum (int[] arr) {
		int sum = 0;
		
		for (int i : arr) {
			sum += i;
		}
		
		return sum;
	}
	
	public static boolean isOverTop (int[] arr, int index, int max) {
		if (arr[index] > max) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void topOffArray (int[] arr, int max) {
		
		for (int i = arr.length-1; i > 0; i--) {
			topOff(arr, i, max);
		}
	}
	
	public static void topOff (int[] arr, int index, int max) {
		if (isOverTop(arr, index, max)) {
			arr[index] -= max;
			arr[index-1]++;
		}
	}
}
