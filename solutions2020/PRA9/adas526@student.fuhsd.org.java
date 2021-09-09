import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRA9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        List<Integer> output = new ArrayList<>();
        
        for (int i = 0; i < x; i++) {
            int n = in.nextInt();
            int h = in.nextInt();
            int[] arr = new int[n];
            
            for (int j = 0; j < n; j++) {
            		int c = in.nextInt();
            		arr[j] = c;
            }
            output.add(bookshelf(arr, h));
        }
        for (int o : output) {
            System.out.println(o);
        }
        in.close();
	}
	public static int bookshelf(int[] arr, int h) {
		Arrays.sort(arr);
		int sum = 0;
		int index = 0;
		int num = 0;
		
		for (int i = arr.length-1; i >= 0; i--) {
			if (sum < h) {
				sum += arr[i];
			} else if (sum == h) {
				return 0;
			} else {
				index = i;
				num = arr[i+1];
				sum -= num;
				break;
			}
		}
		if (sum >= h) {
			return Math.abs(h-sum);
		}
		if (index >= 0) {
			for (int j = 0; j < arr.length; j++) {
				if (sum + arr[j] >= h) {
					return Math.abs(h-(sum+arr[j]));
				}
			}
		}
		return 0;
	}
}
